import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        System.out.print("Digite o numero ?");
        float numero = teclado.nextFloat();

        if (numero % 3 == 0 && numero % 5 ==0){
            System.out.printf("O numero %.1f e divisivel por 3 e 5 ",numero);
        };
    }
}
