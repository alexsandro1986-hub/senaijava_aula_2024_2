import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class iValia  extends JFrame {
    private ArrayList<Avaliacao> alzheimer = new ArrayList();
    //Avaliacao a = new Avaliacao("Forno", "Pizza", 2, "Nâo vale a pena");
    public JPanel painelPrincipal;
    public JTextArea txttexto;
    private JTextField txtestabe;
    private JTextField txtitens;
    private JTextField txtnotas;
    private JTextField txtcomentario;
    private JButton lblGuardar;
    private JButton lblBuscarEs;
    private JButton lblBuscarItem;
    private JButton lblMostrar;
    private JButton lblFake;

    private void mostrarTudo() {
        String s = "";
        for (Avaliacao e : alzheimer) {
            s += String.format("Estabelecimento: %s \nItens: %s \nNota: %d \nComentario: %s\n---------\n",
                    e.getEstabelecimento(), e.getItens(), e.getNota(), e.getComentario());
        }
        txttexto.setText(s);
    }

    public iValia() {

        Avaliacao Forno = new Avaliacao("Forno","Pizza",1,"Não vale a pena");
//        Avaliacao Torta = new Avaliacao;
//        Avaliacao Cuca = new Avaliacao();
        alzheimer.add(Forno);


        lblGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtestabe.getText();
                String itens = txtitens.getText();
                int notas = int.parseFloat(txtnotas.getText());
                String comentario = txtcomentario.getText();

                Avaliacao novaProducao = new Avaliacao(nome, itens, notas, comentario);
                alzheimer.add(novaProducao);
                JOptionPane.showMessageDialog(null,
                        "Produto: " + txtestabe.getText() +
                                "\nitens:" + txtitens.getText() +
                                "\nnotas:" + txtnotas.getText()); +
                        "\ncomentarios:" + txtcomentario.getText());
                txtNome.setText("");
                txtValor.setText("");
                txtpeso.setText("");
            }
        });

        lblMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTudo();
            }
        });

        lblBuscarEs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obter o nome a ser localizado
                String nomeLocalizar = JOptionPane.showInputDialog("Digite o nome do Estabelecimento:");

                // Procurar o produto na lista de dadosProducao
                for (Avaliacao produto : alzheimer) {
                    if (produto.getEstabelecimento().equalsIgnoreCase(nomeLocalizar)) {
                        // Se o produto for encontrado, exibir seus dados
                        JOptionPane.showMessageDialog(null,
                                "Produto encontrado:\n" +
                                        "Nome: " + produto.getEstabelecimento() + "\n" +
                                        "Itens: " + produto.getItens() + "\n" +
                                        "Nota: " + produto.getNota());
                        return; // Encerrar a busca após encontrar o produto
                    }
                }

                // Se o produto não for encontrado, exibir uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });

    }
}


