import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaConta extends JFrame {
    Conta c = new Conta(1, "Cintia", 1500f);
    public JPanel painelPrincipal;
    private JTextField txtsaque;
    private JButton lblSaldo;
    private JTextField txtDeposito;
    private JButton lblDeposito;

    private JLabel ldlSaldo;

    public TelaConta() {

        lblSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float valor = Float.parseFloat(txtsaque.getText());
                c.sacar(valor);
                lblSaldo.setText(Float.toString(c.getSaldo()));
            }
        });
        lblDeposito.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
