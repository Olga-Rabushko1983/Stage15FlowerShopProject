package by.itstep.OlgaRabushko.examtask.controller;

import by.itstep.OlgaRabushko.examtask.model.CollectingBouquet;
import by.itstep.OlgaRabushko.examtask.model.Flower;
import by.itstep.OlgaRabushko.examtask.model.Peony;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

//public class CollectingBouquetTest {


 @Test
    public void testMaxCollectingBouquetPositive() {
        Flower[] flowers = {5, 15, 10};
        int expected = 15;
        int actual = CollectingBouquet.max(flowers);
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testMinCollectingBouquetPositive() {
        Flower[] flowers = {5, 15, 10};
       
        int expected = 5;
        int actual = CollectingBouquet.min(flowers);
        Assert.assertEquals(expected, actual, 0.001);
    }
}
