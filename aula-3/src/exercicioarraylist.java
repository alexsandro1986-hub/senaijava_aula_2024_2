import java.util.ArrayList;
import java.util.Collections;

public class exercicioarraylist {
    public static void main(String[] args) {
            ArrayList<String> dinos = new ArrayList<String>();

            dinos.add("Angaturama");
            dinos.add("Uberabatitan");
            dinos.add("Irritator");
            dinos.add("Oxalaia Quilombensis");

            System.out.println("Arraylist original: " + dinos);

            String dino = dinos.get(1);
            System.out.println("Dino selecionado: " + dino);

            dinos.set(1, "Santanarraptor");
            System.out.println("Modificado: " + dinos);

            dinos.remove(2);
            System.out.println("Removeu o 2: " + dinos);

            int tamanho = dinos.size();
            System.out.println("Tamanho: " + tamanho);

            System.out.println("--= Percorrendo com for =--");
            for (int i= 0; i<dinos.size(); i++){
                System.out.println("Dino: " + dinos.get(i));
            }

            System.out.println("--= Percorrendo com 'forEach' =--");
            for (String d : dinos){
                System.out.println("Dino: " + d);
            }

            Collections.sort(dinos);
            System.out.println("Organizado: " + dinos);

            int indice = dinos.indexOf("Santanarraptor");
            System.out.println("indexOf: " + indice);

        }
    }
//https://www.w3schools.com/java/java_arraylist.asp

