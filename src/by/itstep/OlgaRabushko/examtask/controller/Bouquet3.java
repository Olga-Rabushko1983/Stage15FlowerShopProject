package by.itstep.OlgaRabushko.examtask.controller;

import by.itstep.OlgaRabushko.examtask.model.*;

import static by.itstep.OlgaRabushko.examtask.view.Printer.*;

public class Bouquet3 {

    public static void main(String[] args) {
        CollectingBouquet bouquet=new CollectingBouquet(6);

        Flower chamomile=new Chamomile();
        Flower chrysanthemum=new Chrysanthemum();
        Flower cornflower=new Cornflower();
        Flower lily=new Lily();
        Flower peony=new Peony();
        Flower decoration=new Decoration();

        bouquet.addFlower(decoration);
        bouquet.addFlower(peony);
        bouquet.addFlower(lily);
        bouquet.addFlower(cornflower);
        bouquet.addFlower(chamomile);
        bouquet.addFlower(chrysanthemum);

        printBouquet(bouquet.getFlowers());
        printPrice(bouquet.bouquetCost());
        printWeight(bouquet.weightBouquet());


        int flowerMax= CollectingBouquet.max(bouquet.getFlowers());
        System.out.println("The cost of the most expensive flower,$ = "+flowerMax);

        int flowerMin= CollectingBouquet.min(bouquet.getFlowers());
        System.out.println("The cost of the cheapest flower,$ = "+flowerMin);



    }
}