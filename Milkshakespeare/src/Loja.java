import javax.swing.*;
import java.util.ArrayList;

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

    /*  if (p instanceof Funcionario) {
              Funcionario f = (Funcionario) p;
              System.out.println(f.getCetor());
          } else if (p.getClass() == Professor.class) {
              Professor profe = (Professor) p;
              System.out.println(profe.getArea());
          }*/
    private void mostrarTudo() {
        String s = "";
        for (Pedido e : sequencia) {
            if (e instanceof livro ){
                livro l = (livro) e;
                
                s += String.format("Estabelecimento: %s \nItens: %s \nNota: %d \nComentario: %s\n---------\n",
                        e.getId(), e.getNumero(),l.getNome());
            } else if (e instanceof Milkshake) {
                Milkshake m = (Milkshake) e;
                s += String.format("Estabelecimento: %s \nItens: %s \nNota: %d \nComentario: %s\n---------\n",
                        e.getId(), e.getNumero(),m.getSabor(),m.getTamanho());
            }

        }
        txttexto.setText(s);

   /* private static void testStringsNaturalOrdering() {
        Queue<String> testStringsPQ = new PriorityQueue<>();
        testStringsPQ.add("abcd");
        testStringsPQ.add("1234");
        testStringsPQ.add("23bc");
        testStringsPQ.add("zzxx");
        testStringsPQ.add("abxy");

        System.out.println("Strings armazenadas por ordenamento natural em uma fila de prioridades\n");
        while (!testStringsPQ.isEmpty()) {
            System.out.println(testStringsPQ.poll());
        }
    }*/


    }
}



