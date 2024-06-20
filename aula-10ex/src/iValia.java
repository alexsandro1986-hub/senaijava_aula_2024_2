import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class iValia extends JFrame {
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

     //boatao mostrar tudo
    private void mostrarTudo() {
        String s = "";
        for (Avaliacao e : alzheimer) {
            s += String.format("Estabelecimento: %s \nItens: %s \nNota: %d \nComentario: %s\n---------\n",
                    e.getEstabelecimento(), e.getItens(), e.getNota(), e.getComentario());
        }
        txttexto.setText(s);//mostra no espaçp em branco
    }
        //boatao mostrar tudo

    public iValia() {

        Avaliacao Forno = new Avaliacao("Forno", "Pizza", 1, "Não vale a pena");
        Avaliacao VilaAcoriana = new Avaliacao("Vila Açoriana", "Pizza", 9,"Muito boa");
        Avaliacao MS_Salgado = new Avaliacao("Ms Salgado", "Salgado", 9,"Muito bom");
        Avaliacao PizzaDobro = new Avaliacao("Pizza em dobro", "Pizza", 9,"satisfátoria");
        alzheimer.add(Forno);

        //botãoto fakes
     lblFake.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            alzheimer.add(VilaAcoriana);
            alzheimer.add(MS_Salgado);
            alzheimer.add(PizzaDobro);
            mostrarTudo();
        }
    });
    //boãoto fakes


//boatao mostrar tudo
        lblMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTudo();
            }
        });
        //boatao mostrar tudo

        //boatao guardar
        lblGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = txtestabe.getText();
                String itens = txtitens.getText();
                String notasText = txtnotas.getText();
                String comentario = txtcomentario.getText();

                int notas = 0;
                try {
                    notas = Integer.parseInt(notasText);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null,
                            "Por favor, insira um número válido para as notas.",
                            "Erro de Formato de Número",
                            JOptionPane.ERROR_MESSAGE);
                    return; // Saia do método se a entrada for inválida
                }

                Avaliacao novaProducao = new Avaliacao(nome, itens, notas, comentario);
                alzheimer.add(novaProducao);
                JOptionPane.showMessageDialog(null,
                        "Produto: " + txtestabe.getText() +
                                "\nitens:" + txtitens.getText() +
                                "\nnotas:" + txtnotas.getText() +
                                "\ncomentarios:" + txtcomentario.getText());
                txtestabe.setText("");
                txtitens.setText("");
                txtnotas.setText("");
                txtcomentario.setText("");
            }
        });
        //boatao guardar

        //boatao buscar estabelecimento
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
        //boatao buscar estabelecimento


        //botao buscar item
        lblBuscarItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obter o nome a ser localizado
                String nomeItem = JOptionPane.showInputDialog("Digite o nome do Item:");

                // Procurar o produto na lista de dadosProducao
                for (Avaliacao produto : alzheimer) {
                    if (produto.getItens().equalsIgnoreCase(nomeItem)) {
                        // Se o produto for encontrado, exibir seus dados
                        JOptionPane.showMessageDialog(null,
                                "Produto encontrado:\n" +
                                        "Itens: " + produto.getItens() + "\n" +
                                        "Nome: " + produto.getEstabelecimento() + "\n" +
                                        "Nota: " + produto.getNota());
                        return; // Encerrar a busca após encontrar o produto
                    }
                }

                // Se o produto não for encontrado, exibir uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });

        //botao buscar item






    }

}


