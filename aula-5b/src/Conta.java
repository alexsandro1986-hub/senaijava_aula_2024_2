public class Conta {
    private int numero;
    private String cliente;
    private float Saldo;

    public Conta(int numero, String cliente, float saldo) {
        this.numero = numero;
        this.cliente = cliente;
        Saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return Saldo;
    }

    public void setSaldo(float saldo) {
        Saldo = saldo;
    }

    public void sacar(float valor){
        setSaldo(getSaldo()-valor);
    }
    public void depositar(float valor){
        setSaldo(getSaldo()+valor);
    }


}
