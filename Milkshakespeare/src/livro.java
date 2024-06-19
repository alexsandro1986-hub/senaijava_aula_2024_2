public class livro extends Pedido{
    private String nome;

    public livro(int id, int numero, String nome) {
        super(id, numero);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
