//triangulos
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro lado do triangulo");
        float lado1 = teclado.nextFloat();
        System.out.print("Digite o segundo lado do triangulo");
        float lado2 = teclado.nextFloat();
        System.out.print("Digite o terceiro lado do triangulo");
        float lado3 = teclado.nextFloat();
        if(lado1==lado2 && lado1==lado3){
            System.out.print("Equilatero");
        } else if (lado1 !=lado2 && lado1!=lado3) {
            System.out.print("escaleno");
        }else {
            System.out.print("isoceles");
        }
    }
}
