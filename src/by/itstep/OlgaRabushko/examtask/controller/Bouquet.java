package by.itstep.OlgaRabushko.Stage15.controller;

import by.itstep.OlgaRabushko.Stage15.model.Flower;
import by.itstep.OlgaRabushko.Stage15.model.Searcher;
import by.itstep.OlgaRabushko.Stage15.model.ShopFlower;

public class Bouquet implements ShopFlower {
private Flower[]flowers;

public Bouquet (int count){
    flowers=new Flower[count];
}

    public Flower[] getFlowers() {
        return this.flowers;
    }

    @Override
    public void addFlower(Flower flower) {
        if (Searcher.check(this.flowers)) {
            int position = Searcher.findPosition(this.flowers);
            this.flowers[position] = flower;
        } else {
            System.out.println("Error");
        }

    }

    @Override
    public int bouquetCost() {
    int cost=0;
        for (Flower flower:this.flowers) {
            cost+=flower.getPrice();
        }
        return cost;
    }

    @Override
    public int maxCostFlower() {
//        Flower max = Integer.MIN_VALUE;
//        for (int i = 1; i < flowers.length; i++) {
//            if (Flower flower:this.flowers){
//                max = flowers[i];
//            }
        return 0;
    }

    @Override
    public int minCostFlower() {
        return 0;
    }

    @Override
    public int weightBouquet() {
    int weight=0;
    for (Flower flower:this.flowers) {
        weight+=flower.getWeight();
    }
        return weight;
}
}
