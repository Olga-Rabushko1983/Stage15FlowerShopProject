package by.itstep.OlgaRabushko.Stage15.model;

public abstract class Flower {
    public static final int MIX_PRICE = 5;
    private String name;
    private int price;

    private int weight;

    public Flower(String name, int price,int weight) {
        this.name = name;
        this.price = price;
        this.weight=weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight=weight;
    }
}
