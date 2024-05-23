public class Funcionario extends Pessoa {
    private String cetor;

    public Funcionario(String nome, int id, String senha, String cetor) {
        super(nome, id, senha);
        this.cetor = cetor;
    }

    public void fazerManutencao(String cetor){
        setCetor(cetor);
    }

    public String getCetor() {
        return cetor;
    }

    public void setCetor(String cetor) {
        this.cetor = cetor;
    }
}
