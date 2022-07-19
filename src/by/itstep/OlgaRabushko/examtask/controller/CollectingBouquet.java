package by.itstep.OlgaRabushko.examtask.controller;

import by.itstep.OlgaRabushko.examtask.model.Flower;
import by.itstep.OlgaRabushko.examtask.model.Searcher;
import by.itstep.OlgaRabushko.examtask.model.ShopFlower;


public  class CollectingBouquet implements ShopFlower {
    private Flower[] flowers;

    public CollectingBouquet(int count) {
        flowers = new Flower[count];
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
            System.out.println("No position");
        }

    }

    @Override
    public int bouquetCost() {
        int cost = 0;
        for (Flower flower : this.flowers) {
            cost += flower.getPrice();
        }
        return cost;
    }


    @Override
    public int weightBouquet() {
        int weight = 0;
        for (Flower flower : this.flowers) {
            weight += flower.getWeight();
        }
        return weight;
    }


    static  int max(Flower[] flowers) {

        int max = flowers[0].getPrice();

        for (int i = 1; i < flowers.length; i++) {
            if (flowers[i].getPrice() > max) {
                max = flowers[i].getPrice();
            }
        }

        return max;
    }

    static int min(Flower[] flowers) {

        int min = flowers[0].getPrice();

        for (int i = 1; i < flowers.length; i++) {
            if (flowers[i].getPrice() < min) {
                min = flowers[i].getPrice();
            }
        }

        return min;
    }
}