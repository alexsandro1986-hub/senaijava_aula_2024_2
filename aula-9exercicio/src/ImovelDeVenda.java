public class ImovelDeVenda extends Imovel{
    private String venda;

    public ImovelDeVenda(String nome, int id, float tamanhoF, String venda) {
        super(nome, id, tamanhoF);
        this.venda = venda;
    }

    public String getVenda() {
        return venda;
    }

    public void setVenda(String venda) {
        this.venda = venda;
    }
}
