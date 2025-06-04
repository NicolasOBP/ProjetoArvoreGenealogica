
public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String cpf;
    private boolean genitor;

    public Pessoa() {
        nome = null;
        dataNascimento = null;
        cpf = null;
        genitor = false;
    }

    public void setPessoa(String nome, String dataNasc, boolean genitor, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNasc;
        this.cpf = cpf;
        this.genitor = genitor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.cpf.equals(obj)) {
            return true;
        }
        
        try {
            if (this.genitor == (boolean) obj) {
                return true;
            }
        } catch (Exception e) {
        }
        
        return false;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf
                + ", dataCasamento=, genitor=" + genitor + "]";
    }
}
