import javax.swing.*;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class exercicio_1 {
    public static void main(String[] args) {
        int maior = 0;
        int i = 0;
        while (i < 4) {

            int numero;
            numero = Integer.parseInt(JOptionPane.showInputDialog("numero:"));
            if (numero > maior) {
                maior = numero;
            };
            i++;
        }
        ;
        System.out.println( maior);
    }
}


