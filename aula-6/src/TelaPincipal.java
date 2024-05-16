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


        btnmostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarTudo();
            }
        });

        btnfakes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dadosProducao.add(Pao);
                dadosProducao.add(Torta);
                dadosProducao.add(Cuca);
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

        btnlocalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obter o nome a ser localizado
                String nomeLocalizar = JOptionPane.showInputDialog("Digite o nome do produto:");

                // Procurar o produto na lista de dadosProducao
                for (crudPadaria produto : dadosProducao) {
                    if (produto.getNome().equalsIgnoreCase(nomeLocalizar)) {
                        // Se o produto for encontrado, exibir seus dados
                        JOptionPane.showMessageDialog(null,
                                "Produto encontrado:\n" +
                                        "Nome: " + produto.getNome() + "\n" +
                                        "Valor: " + produto.getValor() + "\n" +
                                        "Peso: " + produto.getPeso());
                        return; // Encerrar a busca após encontrar o produto
                    }
                }

                // Se o produto não for encontrado, exibir uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });
        btneditar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Solicitar ao usuário que insira o nome do produto a ser editado
                String nomeEditar = JOptionPane.showInputDialog("Digite o nome do produto a ser editado:");

                // Procurar o produto na lista de dadosProducao
                for (crudPadaria produto : dadosProducao) {
                    if (produto.getNome().equalsIgnoreCase(nomeEditar)) {
                        // Exibir uma caixa de diálogo com os detalhes do produto para edição
                        JTextField txtNomeEdit = new JTextField(produto.getNome());
                        JTextField txtValorEdit = new JTextField(String.valueOf(produto.getValor()));
                        JTextField txtPesoEdit = new JTextField(String.valueOf(produto.getPeso()));
                        Object[] fields = {"Nome:", txtNomeEdit, "Valor:", txtValorEdit, "Peso:", txtPesoEdit};
                        int result = JOptionPane.showConfirmDialog(null, fields, "Editar Produto", JOptionPane.OK_CANCEL_OPTION);
                        if (result == JOptionPane.OK_OPTION) {
                            // Atualizar os detalhes do produto com as informações editadas
                            produto.setNome(txtNomeEdit.getText());
                            produto.setValor(Float.parseFloat(txtValorEdit.getText()));
                            produto.setPeso(Float.parseFloat(txtPesoEdit.getText()));
                            // Mostrar uma mensagem de confirmação
                            JOptionPane.showMessageDialog(null, "Produto editado com sucesso.");
                            // Atualizar a exibição na JTextArea
                           // mostrarTudo();
                            return; // Encerrar a busca após editar o produto
                        }
                    }
                }

                // Se o produto não for encontrado, exibir uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Produto não encontrado.");
            }
        });


    }


}
