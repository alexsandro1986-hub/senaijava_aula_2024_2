//ano bissexto
import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano?");
        float ano = teclado.nextFloat();
        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 ==0){
            System.out.print("O ano e bissexto:");
        }else {
            System.out.print("o ano não e bissexto:");
        }
    };
}
