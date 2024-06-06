public class ImovelDeAluguel extends Imovel {

    private int aluguel;
    private float valordoAluguel;
    private String disponibilidade;

    public ImovelDeAluguel(float area, String tipo, String padrao, int numeroQuartos, int id, String endereco, int aluguel, float valordoAluguel, String disponibilidade) {
        super(area, tipo, padrao, numeroQuartos, id, endereco);
        this.aluguel = aluguel;
        this.disponibilidade = disponibilidade;
        this.valordoAluguel = valordoAluguel;
    }

    public void alugar(){
        System.out.println("Livre");
    }

    public void devolver(){
        System.out.println("Limpar");
    }

    public int getAluguel() {
        return aluguel;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public float getValordoAluguel() {
        return valordoAluguel;
    }

    public void setValordoAluguel(float valordoAluguel) {
        this.valordoAluguel = valordoAluguel;
    }
}
