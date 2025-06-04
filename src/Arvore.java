
public class Arvore<T> {

    private No<T> raiz;

    public Arvore() {
        raiz = null;
    }

    public void insereRaiz(T info) throws RuntimeException {
        if (info.equals(false)) {
            throw new RuntimeException("Raiz tem que ser genitor");
        }

        raiz = new No<>(info);
    }

    public void setConje(T info, String dataCasa, String cpf) {
        if (info.equals(true)) {
            System.out.println("Conje não pode ser genitor");
            return;
        }

        No<T> conje = new No<>(info);
        if (achaNo(raiz, cpf) != null) {
            System.out.println("CPF já existe");
            return;
        }

        No<T> ponto = achaNo(raiz, cpf);

        if (ponto == null) {
            System.out.println("Pessoa não encontrada");
            return;
        }

        if (ponto.getDataFalescimento() != null) {
            System.out.println("Pessoa já foi de arrasta para cima, não pode colocar conje");
            return;
        }

        if (ponto.getConje() == null) {
            conje.setDataCasamento(dataCasa);

            ponto.setConje(conje);
            ponto.setDataCasamento(dataCasa);
        } else {
            System.out.println("Não pode colocar conje onde já tem conje");
        }
    }

    public void setFilho(T info, String cpf) {
        if (info.equals(false)) {
            System.out.println("Filho tem que ser genitor");
            return;
        }

        if (achaNo(raiz, cpf) != null) {
            System.out.println("CPF já existe");
            return;
        }

        No<T> ponto = achaNo(raiz, cpf);

        if (ponto == null) {
            System.out.println("Pessoa não encontrada");
            return;
        }

        if (ponto.getDataFalescimento() != null) {
            System.out.println("Pessoa já foi de arrasta para cima, não pode ter mais filhos");
            return;
        }

        if (ponto.getConje() == null) {
            System.out.println("Não pode ter filhos se não for casado");
            return;
        }

        ponto.setFilho(info);
    }

    public void setFalecimento(String data, String cpf) {
        No<T> ponto = achaNo(raiz, cpf);

        if (ponto == null) {
            System.out.println("Pessoa não encontrada");
            return;
        }

        if (ponto.getDataFalescimento() != null) {
            System.out.println("Pessoa já tem data de falecimento");
            return;
        }

        ponto.setDataFalecimento(data);
    }

    public No<T> achaNo(No<T> corrente, String cpf) {
        if (corrente.getInfo().equals(cpf)) {
            return corrente;
        }

        if (corrente.getConje() != null) {
            No<T> no = achaNo(corrente.getConje(), cpf);

            if (no != null) {
                return no;
            }
        }

        if (corrente.getQtdeFilhos() >= 1) {
            No<T> no = achaNo(corrente.getFilhos().getPrimeiroFilho(), cpf);

            if (no != null) {
                return no;
            }
        }

        if (corrente.getProxIrmao() != null) {
            No<T> no = achaNo(corrente.getProxIrmao(), cpf);

            if (no != null) {
                return no;
            }
        }

        return null;
    }

    public String mostraPessoa(String cpf){
        No<T> ponto = achaNo(raiz, cpf);

        if (ponto == null) {
            System.out.println("Pessoa não encontrada");
            return "";
        }

        String info = ponto.getInfo().toString();
        String dataCasamento = ponto.getDataCasamento();
        String dataFalescimento = ponto.getDataFalescimento();
        int qtdeFilhos = ponto.getQtdeFilhos();
        String conjeInfo = "";

        if (ponto.getConje() != null) {
            conjeInfo = ponto.getConje().getInfo().toString();
        }

        return info + "\nData casamento: " + dataCasamento + "\nData Falescimento: " + dataFalescimento + "\nQuantidade de Filhos: " + qtdeFilhos + "\nConje: " + conjeInfo;
    }
}
