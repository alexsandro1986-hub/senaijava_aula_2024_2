import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        iValia i = new iValia();
        i.setContentPane(i.painelPrincipal);
        i.setTitle("Simulador");
        i.setSize(800,700);
        i.setVisible(true);
        i.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}