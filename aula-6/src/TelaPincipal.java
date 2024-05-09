import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaPincipal extends JFrame {
    private ArrayList<crudPadaria> dadosProducao = new ArrayList<crudPadaria>();

    public JPanel painelPrincipal;
    private JTextField txtNome;
    private JTextField txtValor;
    private JTextField txtpeso;
    private JButton btncadastro;
    private JButton btnapagar;
    private JButton btnmostrar;
    private JButton btnlocalizar;
    private JButton btneditar;
    private JButton btnfakes;
    private JPanel painel;
    private JTextArea txttexto;


    private void mostrarTudo() {
        String s = "";
        for (crudPadaria d : dadosProducao) {
            s += String.format("Nome: %s \nValor: %.2f \nPeso: %.2f \n---------\n",
                    d.getNome(), d.getValor(), d.getPeso());
        }
        txttexto.setText(s);
    }


    public TelaPincipal() {

        crudPadaria Pao = new crudPadaria("Pao", 1.50f, 100);
        crudPadaria Torta = new crudPadaria("Torta", 150f, 2);
        crudPadaria Cuca = new crudPadaria("Cuca", 25f, 3);
        dadosProducao.add(Pao);
        dadosProducao.add(Torta);
        dadosProducao.add(Cuca);

        btnmostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTudo();
            }
        });

        btncadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                float valor = Float.parseFloat(txtValor.getText());
                float peso = Float.parseFloat(txtpeso.getText());

                crudPadaria novaProducao = new crudPadaria(nome, valor, peso);
                dadosProducao.add(novaProducao);
                JOptionPane.showMessageDialog(null,
                        "Produto: " + txtNome.getText() +
                                "\nvalor:" + txtValor.getText() +
                                "\npeso:" + txtpeso.getText());
                txtNome.setText("");
                txtValor.setText("");
                txtpeso.setText("");
            }
        });

        btnapagar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtValor.setText("");
                txtpeso.setText("");

            }
        });

    }


}
