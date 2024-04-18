public class Pessoa {

    private String nome;
    public Pessoa(String n, int i){
        this.nome=n;
        this.idade=i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int idade;

    public int getIdade(){
        return this.idade;
    }
    public  void setIdade(int i ){

        this.idade = i;
    }
    public void dizerOla(){
        System.out.println("Ola");
    }


}
