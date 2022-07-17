//Цветочница (Flower Shop). Определить иерархию цветов и дополнительной
//декоративной зелени. Собрать несколько цветочных букетов. Подсчитать вес
//и стоимость букетов. Найти самый дорого и недорогой цветки в букете.
// Вывести список цветов, входящих в букет, в отсортированном виде согласно заданному критерию сортировки.
package by.itstep.OlgaRabushko.Stage15.controller;

import by.itstep.OlgaRabushko.Stage15.model.*;
import by.itstep.OlgaRabushko.Stage15.view.Printer;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet=new Bouquet(5);

        Flower chamomile=new Chamomile();
        Flower chrysanthemum=new Chrysanthemum();
        Flower cornflower=new Cornflower();
        Flower lily=new Lily();
        Flower peony=new Peony();


        bouquet.addFlower(peony);
        bouquet.addFlower(lily);
        bouquet.addFlower(cornflower);
        bouquet.addFlower(chamomile);
        bouquet.addFlower(chrysanthemum);

        Printer.printBouquet(bouquet.getFlowers());
        Printer.printPrice(bouquet.bouquetCost());
        Printer.printWeight(bouquet.weightBouquet());


    }
}
