//Tente abstrair e implementar as classes em Java para representar imóveis em uma imobiliária.
//
//Você pode pensar em uma superclasse (classe mãe,
// progenitora…) `Imovel`
//e algumas classes filhas como por exemplo
// `ImovelDeAluguel`, `ImovelDeVenda` ou `ImovelDeTemporada`…

import java.util.ArrayList;

public class Main {
   public static void main (String[] args){
       ArrayList<Imovel> imovel = new ArrayList<>();

       //Imovel
       ImovelDeAluguel imovelAluguel = new ImovelDeAluguel("Alex", 1, 54,4);
       System.out.println(imovelAluguel.getNome());
   }


}