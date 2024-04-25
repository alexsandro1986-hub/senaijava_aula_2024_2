import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaConta t = new TelaConta();
        t.setContentPane(t.painelPrincipal);
        t.setTitle("Simulador");
        t.setSize(400,300);
        t.setVisible(true);
        t.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}