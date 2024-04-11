import javax.swing.*;
public class exercicio_1for_while {
        public static void main(String[] args) {
            int n, maior = -1;
            for(int i=0; i<10; i++){
                do {
                    n = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "o número: "));
                }while(n<0 || n>100);
                if(n>maior){
                    maior = n;
                }
            }
            System.out.println("Maior: " + maior);
        }
    }

