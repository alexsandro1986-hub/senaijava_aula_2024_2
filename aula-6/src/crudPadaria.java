public class crudPadaria {
    private String nome;
    private float valor;
    private float peso;

    public crudPadaria(String nome, float valor, float peso ){
        this.nome= nome;
        this.valor=valor;
        this.peso=peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float altura) {
        this.valor = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

}
