/*import javax.swing.*;

public class Main {
    static void escrever(String t){
        JOptionPane.showMessageDialog(null, t);
    }

    public static void main(String[] args) {
        escrever("noob safado");
    }
}*/
import javax.swing.*;

public class Main {
//    static void escrever(String t){
//        JOptionPane.showMessageDialog(null, t);
//    }

//    static float media(int a, int b){
//        float soma = (float) a+b;
//        return soma/2;
//    }

    public static void main(String[] args) {
//        escrever("Oi gente");
//        float valor = media(3,8);
//        System.out.println(valor);
          Pessoa p =  new Pessoa("Breno", 10);
         // p.setIdade(16);
       // p.idade = p.idade +1;
        p.setIdade(p.getIdade()+1);
        System.out.println("A pessoa "+ p.getNome() + " tem " +p.getIdade()+" anos ");
       // p.dizerOla();
    }

}
