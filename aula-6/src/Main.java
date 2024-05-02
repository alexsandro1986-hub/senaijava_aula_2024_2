import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaPincipal p = new TelaPincipal();
        p.setContentPane(p.painelPrincipal);
        p.setTitle("Crud");
        p.setSize(800,600);
        p.setVisible(true);
        p.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}