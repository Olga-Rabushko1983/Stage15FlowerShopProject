package by.itstep.OlgaRabushko.Stage15.view;

import by.itstep.OlgaRabushko.Stage15.model.Flower;

public class Printer {
    public static void printBouquet(Flower[] flowers) {
        StringBuilder stringBuilder = new StringBuilder(flowers.length);
        stringBuilder.append("The bouquet consists of: ");
        for (Flower flower : flowers) {
            stringBuilder.append(flower.getName());
            stringBuilder.append(" ");

        }
        System.out.println(stringBuilder.toString());
    }

    public static void printPrice(int price) {
        System.out.println("Price of the bouquet,$ =" + price);
    }

    public static void printWeight(int weight) {
        System.out.println("Bouquet weight,gr = " + weight);

    }
}
