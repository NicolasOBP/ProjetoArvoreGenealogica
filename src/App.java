
public class App {

    private static Arvore<Pessoa> arvore;

    public static void main(String[] args) throws Exception {
        arvore = new Arvore<>();

        System.out.println("Hello, World! Esse é o app de arvore genealógica");
        System.out.println("Primeiro você precisa adicionar a raiz que é o começo da árvore");

        arvore.insereRaiz(criaPessoa());

        for (int i = 1; i != 0; i++) {
            opcoes();
        }
    }

    public static void opcoes() {
        System.out.println("\nO que você quer fazer?");
        System.out.println("1 - colocar conje");
        System.out.println("2 - colocar filho");
        System.out.println("3 - informar falecimento");
        System.out.println("4 - mostrar pessoa");
        System.out.println("5 - sair");

        int opcoes = Entradas.num("Coloque a opção: ");

        switch (opcoes) {
            case 1:
                String dataCasa = Entradas.texto("Coloque a data de casamento: ");
                String cpfPessoa = Entradas.texto("Qual pessoa você vai colocar conje: ");
                System.out.println("Informações do conje");
                arvore.setConje(criaPessoa(), dataCasa, cpfPessoa);
                break;
            case 2:
                cpfPessoa = Entradas.texto("Qual pessoa você vai colocar filho: ");
                System.out.println("Informações do filho: ");
                arvore.setFilho(criaPessoa(), cpfPessoa);
                break;
            case 3:
                cpfPessoa = Entradas.texto("Qual pessoa você vai colocar data de falscimento: ");
                String dataFalescimento = Entradas.texto("Data falescimento: ");
                arvore.setFalecimento(dataFalescimento, cpfPessoa);
                break;
            case 4:
                cpfPessoa = Entradas.texto("CPF da pessoa a ser exibida: ");
                System.out.println(arvore.mostraPessoa(cpfPessoa));
                break;
            case 5:
                break;

            default:
                System.out.println("Número incorreto");
                break;
        }
    }

    public static Pessoa criaPessoa() {
        Pessoa pessoa = new Pessoa();

        String nome = Entradas.texto("Nome: ");
        String dataNasc = Entradas.texto("Data nascimento: ");
        boolean genitor = Entradas.boleano("É genitor? 1 para sim 0 para não: ");
        String cpf = Entradas.texto("CPF: ");

        pessoa.setPessoa(nome, dataNasc, genitor, cpf);

        return pessoa;
    }
}
