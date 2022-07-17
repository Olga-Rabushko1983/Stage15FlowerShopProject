package by.itstep.OlgaRabushko.examtask.controller;

import by.itstep.OlgaRabushko.examtask.model.Flower;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import static sun.management.MemoryUsageCompositeData.getMax;


public class MaxMin {
//    public static Flower max(Flower[] flowers) {
//        Flower max = getMax(flowers);
//        return max;
//        for (int i = 0; i < flowers.length; i++) {
//            if (flowers[i] > max) {
//                max = flowers[i];




    @Contract(pure = true)
    public static @NotNull Flower getMax(Flower[] flowers) {
        return getMax(flowers);
    }
}
