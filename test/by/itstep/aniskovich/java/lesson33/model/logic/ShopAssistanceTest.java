package by.itstep.aniskovich.java.lesson33.model.logic;

import by.itstep.aniskovich.java.lesson33.model.enity.Bread;
import by.itstep.aniskovich.java.lesson33.model.enity.Milk;
import by.itstep.aniskovich.java.lesson33.model.enity.Orange;
import by.itstep.aniskovich.java.lesson33.model.enity.Water;
import by.itstep.aniskovich.java.lesson33.model.enity.container.Basket;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testCalculateTotalPricePositive(){
        //arrange
        Milk[] milks = {new Milk(1000, 3.5, 2)};
        Bread[] breads = {new Bread("Black", "first", 1.5)};
        Orange[] oranges = {new Orange(100, 3000, 0.5)};
        Water[] waters = {new Water(2)};

        Basket basket = new Basket(oranges, milks, breads, waters);

        double expected = 6.0;

        //act
        double actual = ShopAssistance.calculateTotalPrice(basket);

        //assert
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalPriceByNull(){
        //arrange
        Basket basket = null;
        double expected = -1;

        //act
        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalPriceByEmptyBasket(){
        //arrange
        Basket basket = new Basket();
        double expected = -1;

        //act
        double actual = ShopAssistance.calculateTotalPrice(basket);

        assertEquals(expected, actual, 0.0);
    }

}
