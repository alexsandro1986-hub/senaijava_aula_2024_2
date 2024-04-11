import javax.swing.*;
import java.util.Arrays;
public class explicacao3arrays {
        public static void main(String[] args) {
            int[] idades = {14,12,25,44,11,8};
          //Arrays.sort(idades);
            for (int n : idades){
                System.out.print(n + " ");
            }
            System.out.println("");
            int i = Integer.parseInt(JOptionPane.showInputDialog("n:"));
            int pos = Arrays.binarySearch(idades,i);
            System.out.println("Valor na encontrado na posição: "+pos);
        }
    }


