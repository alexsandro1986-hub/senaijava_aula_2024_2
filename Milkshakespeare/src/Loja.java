import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Loja  extends JFrame {
    private ArrayList<Pedido> sequencia = new ArrayList();
    private JButton btnjunior;
    private JButton btnPleno;
    private JButton btnSenior;
    public JPanel painelPrincipal;
    private JButton btnLivro;
    private JButton btnMilk;
    private JTextField pedidoa;
    private JTextArea txttexto;

    public Loja() {
        btnMilk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = 1;
                int numero = 2;
                String tamanho = "pequeno";
                String sabor = "choclo";

                Milkshake novoMilk = new Milkshake(id, numero, tamanho, sabor);
                sequencia.add(novoMilk);
                mostrarTudo();  // Atualiza a exibição dos pedidos

                JOptionPane.showMessageDialog(null,
                        "ID: "+ sequencia.size() + 1+
                                "\nNúmero: " + numero +
                                "\nNome: " + tamanho+
                                "\nNome: " + sabor,
                        "Informações do Livro",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });//boatao mostrar Milk

        //boatao mostrar livro
        btnLivro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                int id = 1;
                int numero = 2;
                String nome = "teste";

                livro novoLivro = new livro(id, numero, nome);
                sequencia.add(novoLivro);
                mostrarTudo();  // Atualiza a exibição dos pedidos

                JOptionPane.showMessageDialog(null,
                        "ID: "+ sequencia.size() + 1+
                                "\nNúmero: " + numero +
                                "\nNome: " + nome,
                        "Informações do Livro",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        });//boatao mostrar livro
    }

    private void mostrarTudo() {
        String s = "";
        for (Pedido e : sequencia) {
            if (e instanceof livro ){
                livro l = (livro) e;

                s += String.format("Estabelecimento:  \nid: %d \nnumero: %d \nComentario: %s\n---------\n",
                        e.getId(), e.getNumero(),l.getNome());
            } else if (e instanceof Milkshake) {
                Milkshake m = (Milkshake) e;
                s += String.format("Estabelecimento:  \nid: %s \nnumero: %d \ntamanho: %s \nsabor: %s \n---------\n",
                        e.getId(), e.getNumero(),m.getSabor(),m.getTamanho());
            }

        }
        txttexto.setText(s);
    }

}



