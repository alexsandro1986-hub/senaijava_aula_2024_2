public class Imovel {

    private String nome;
    private int id;
    private float tamanhoF;

    public Imovel(String nome, int id, float tamanhoF){
        this.nome = nome;
        this.id = id;
        this.tamanhoF = tamanhoF;
    }

    public Imovel (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTamanhoF() {
        return tamanhoF;
    }

    public void setTamanhoF(float tamanhoF) {
        this.tamanhoF = tamanhoF;
    }
}
