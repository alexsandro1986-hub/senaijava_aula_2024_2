import javax.swing.*;

/***Ler n salários e:**
 **(a) encontrar o maior**
 **(b) aplicar 10% de aumento a quem ganha menos de R$2500,00**
 **(c) mostrar o total da folha de pagamento antiga**
 **(d) mostrar o total da folha corrigida***/

public class exerciciosalario {
    public static void main(String[] args) {
        int n, maior = -1;
        float novosalario = 0;

        for (int i = 0; i < 3; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog((i + 1) + "o número: "));

            float salarioPorcetagem = (float) 0.1F;
            if (n < 2500) {
                novosalario = n+(n * salarioPorcetagem);
            }
            if (n > maior) {
                maior = n;
            }

        }
        System.out.println("Novo Salario:" + novosalario);
    }
}
