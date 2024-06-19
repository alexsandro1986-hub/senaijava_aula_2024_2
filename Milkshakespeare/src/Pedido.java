public class Pedido {
    private int id;
    private int numero;

    public Pedido(int id, int numero) {
        this.id = id;
        this.numero = numero;
    }

    public  Pedido (){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
