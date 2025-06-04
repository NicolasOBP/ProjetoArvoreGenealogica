public class No<T> {
    private T info;
    private Lista<T> filhos;
    private int qtdeFilhos;
    private No<T> proxIrmao;
    private No<T> conje;
    private String dataFalescimento;
    private String dataCasamento;

    public No(T info) {
        this.info = info;
        proxIrmao = null;
        conje = null;
        qtdeFilhos = 0;
        filhos = new Lista<>();
        dataFalescimento = null;
        dataCasamento = null;
    }

    public void setConje(No<T> noConje) {
        this.conje = noConje;
    }

    public No<T> getConje() {
        return this.conje;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public void setFilho(T info) {
        No<T> filho = new No<>(info);
        filhos.inserir(filho);

        qtdeFilhos++;
    }

    public Lista<T> getFilhos() {
        return this.filhos;
    }

    public void setProxIrmao(No<T> prox) {
        this.proxIrmao = prox;
    }

    public No<T> getProxIrmao() {
        return this.proxIrmao;
    }

    public void setDataFalecimento(String data) {
        this.dataFalescimento = data;
    }

    public String getDataFalescimento() {
        return this.dataFalescimento;
    }

    public String getDataCasamento() {
        return this.dataCasamento;
    }

    public int getQtdeFilhos() {
        return qtdeFilhos;
    }

    public void setDataCasamento(String dataCasa) {
        this.dataCasamento = dataCasa;
    }
}