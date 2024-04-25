import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Qual a nota do aluno?");
        float nota = teclado.nextFloat();
        System.out.print("Quantas faltas teve o aluno");
        float falta = teclado.nextFloat();
        float mediaFalta = (falta*100)/100;
        if (nota >= 7 && mediaFalta >= 75) {
            System.out.printf("Aprovado   %.1f  %.1f",nota, mediaFalta);

        } else if (nota >=  7 && mediaFalta < 75) {
            System.out.printf("Reprovado por faltra %.1f",mediaFalta);
        }
        ;
        }
    }

