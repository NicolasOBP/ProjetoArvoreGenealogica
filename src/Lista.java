public class Lista<T> {
    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    public Lista() {
        primeiro = null;
        ultimo = null;
        tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void inserir(No<T> filho) {
        if (estaVazia()) {
            primeiro = filho;
        } else {
            ultimo.setProxIrmao(filho);
        }

        ultimo = filho;
        tamanho++;
    }

    public No<T> getPrimeiroFilho() {
        return this.primeiro;
    }
}
