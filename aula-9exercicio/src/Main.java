//Tente abstrair e implementar as classes em Java para representar imóveis em uma imobiliária.
//
//Você pode pensar em uma superclasse (classe mãe,
// progenitora…) `Imovel`
//e algumas classes filhas como por exemplo
// `ImovelDeAluguel`, `ImovelDeVenda` ou `ImovelDeTemporada`…

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Imovel> imovel = new ArrayList<>();

        // Imovel
        ImovelDeAluguel imovelAluguel = new ImovelDeAluguel(500f, "Chale", "Rustico", 2, 1, "Ana", 1, 1050f, "sim");
        imovel.add(imovelAluguel);
        // System.out.println(imovelAluguel.getArea());


        //ImoveldeVenda
        ImovelDeVenda imovelDeVenda = new ImovelDeVenda(1000f, "Casa de campo", "Rustico", 2, 2, "Imarui", 250000f);
        imovel.add(imovelDeVenda);
       // System.out.println(imovelDeVenda.getPreco());

        for (Imovel i : imovel) {
          //  System.out.println(i.getArea());
            //System.out.println(i.getTipo());
            System.out.println(i.getPadrao());
        }


    }


}