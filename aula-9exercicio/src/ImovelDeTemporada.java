public class ImovelDeTemporada extends Imovel{
    private String temporada;

    public ImovelDeTemporada(String nome, int id, float tamanhoF, String temporada) {
        super(nome, id, tamanhoF);
        this.temporada = temporada;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}
