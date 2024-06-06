public class ImovelDeTemporada extends Imovel{
    private String temporada;

    public ImovelDeTemporada(float area, String tipo, String padrao, int numeroQuartos, int id, String endereco, String temporada) {
        super(area, tipo, padrao, numeroQuartos, id, endereco);
        this.temporada = temporada;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }
}
