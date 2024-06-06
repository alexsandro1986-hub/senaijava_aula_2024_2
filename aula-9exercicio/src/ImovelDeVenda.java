public class ImovelDeVenda extends Imovel{
    private float preco;

    public ImovelDeVenda(float area, String tipo, String padrao, int numeroQuartos, int id, String endereco, float preco) {
        super(area, tipo, padrao, numeroQuartos, id, endereco);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
