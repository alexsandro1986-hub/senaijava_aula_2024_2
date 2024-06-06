public class Imovel {

    private String endereco;
    private float area;
    private int numeroQuartos;
    private int id;
    private String tipo;
    private String padrao;

    public Imovel(float area, String tipo, String padrao, int numeroQuartos, int id, String endereco) {
        this.area = area;
        this.tipo = tipo;
        this.padrao = padrao;
        this.numeroQuartos = numeroQuartos;
        this.id = id;
        this.endereco = endereco;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
