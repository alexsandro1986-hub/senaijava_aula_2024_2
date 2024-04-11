import javax.swing.*;
public class explicacao2for {
    public static void main(String[] args) {

            int[] idades = new int[5];

            for(int i=0; i<5; i++){
                idades[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i+1) + "a idade:"));
            }

            String texto = "";
            for(int idade : idades){
                texto += "Idade: " + idade + ";\n";
            }
            JOptionPane.showMessageDialog(null, texto);
            System.out.println(texto);
        }
    }

