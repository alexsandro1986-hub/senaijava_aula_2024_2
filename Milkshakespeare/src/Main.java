import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Loja l = new Loja();
        l.setContentPane(l.painelPrincipal);
        l.setTitle("Simulador");
        l.setSize(800,700);
        l.setVisible(true);
        l.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}