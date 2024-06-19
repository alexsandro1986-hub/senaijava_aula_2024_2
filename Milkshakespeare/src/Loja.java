import javax.swing.*;
import java.util.ArrayList;

public class Loja  extends JFrame{
    private ArrayList<Pedido> sequencia = new ArrayList();
    private JButton btnjunior;
    private JButton btnPleno;
    private JButton btnSenior;
    public JPanel painelPrincipal;
    private JButton btnLivro;
    private JButton btnMilk;
    private JTextField pedidoa;
    private JPanel txttexto;

    private void mostrarTudo() {
        String s = "";
        for (Pedido e : sequencia) {
            s += String.format("Estabelecimento: %s \nItens: %s \nNota: %d \nComentario: %s\n---------\n",
                    e.getId(), e.getNumero(), e.getNumero(), e.getSabor(), e.getTamanho());
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



