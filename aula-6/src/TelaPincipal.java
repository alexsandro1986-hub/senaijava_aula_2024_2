import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaPincipal extends JFrame{
    private ArrayList<crudPadaria> dadosProducao= new ArrayList<crudPadaria>();

    public JPanel painelPrincipal;
    private JTextField txtNome;
    private JTextField txtAltura;
    private JTextField txtpeso;
    private JButton btncadastro;
    private JButton btnapagar;
    private JButton btnmostrar;
    private JButton btnlocalizar;
    private JButton btneditar;
    private JButton btnfakes;
    private JPanel painel;
    private JTextArea txttexto;

    private void mostrarTudo(){
        String s= "";
                txttexto.setText("");
        for(crudPadaria d : dadosProducao){
            s =s.concat(String.format("Nome: %s \nAltura: %d \nPeso %f \n---------"+
            d.getNome(), d.getAltura(), d.getPeso()));
        }
        txttexto.setText(s);
    }

    public TelaPincipal() {

        crudPadaria Pao = new crudPadaria("pao", 1.50f, 100) ;
        crudPadaria Torta = {"Torta", "2.00", "150"};
        crudPadaria Cuca = {"Cuca", "1.80", "120"};

        dadosProducao.add(Pao);
        dadosProducao.add(Torta);
        dadosProducao.add(Cuca);

        btncadastro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String altura = txtAltura.getText();
                String peso = txtpeso.getText();


                String[] dados = {nome, altura, peso};
                dadosProducao.add(dados);
                JOptionPane.showMessageDialog(null,
                        "ola: " + txtNome.getText() +
                                "\naltura:" + txtAltura.getText() +
                                "\npeso:" + txtpeso.getText());

            }

        });
    }


}
