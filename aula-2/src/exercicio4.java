//par maior que 10
import java.util.Scanner;
public class exercicio4 {
    public static void main(String[] args){
        Scanner teclado =new Scanner(System.in);
        System.out.print("Digite um numero?");
        float numero = teclado.nextFloat();
        if(numero %2 ==0 && numero >= 10){
            System.out.printf("É par e maior  ou igual a  10 %.1f",numero);
        }else if(numero %2 == 0 && numero < 10) {
            System.out.printf("É par más e menor que 10 %.1f",numero);
        }else if (numero%2 !=0 && numero >=10){
            System.out.printf("Nao e par mas e maior que 10 :  %.1f",numero);
        }else {
            System.out.print("Não e par é menor que 10");
        }
    }
}
