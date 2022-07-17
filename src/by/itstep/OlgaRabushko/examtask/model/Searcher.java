package by.itstep.OlgaRabushko.Stage15.model;

public class Searcher{
public static boolean check(Flower[]flowers) {
    boolean value=true;

    if (flowers[flowers.length-1] != null) {
            value=false;
        }return value;
    }
    public static int findPosition(Flower[]flowers) {
   int position=0;
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i] == null) {
                return position=i;
            }
        }
        return position;
    }


}