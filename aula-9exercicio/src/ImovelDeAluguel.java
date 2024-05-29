public class ImovelDeAluguel extends Imovel {
    private int aluguel;

    public ImovelDeAluguel(String nome, int id, float tamanhoF, int aluguel) {
        super(nome, id, tamanhoF);
        this.aluguel = aluguel;
    }

    public int getAluguel() {
        return aluguel;
    }

    public void setAluguel(int aluguel) {
        this.aluguel = aluguel;
    }
}
