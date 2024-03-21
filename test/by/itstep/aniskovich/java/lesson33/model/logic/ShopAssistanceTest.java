package by.itstep.aniskovich.java.lesson33.model.logic;

import by.itstep.aniskovich.java.lesson33.model.enity.*;
import by.itstep.aniskovich.java.lesson33.model.enity.container.Basket;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShopAssistanceTest {
    @Test
    public void testCalculateTotalPricePositive(){
        //arrange
        Product[] products = {new Milk(1000, 3.5, 2),
                new Bread("Black", "first", 1.5),
                new Orange(100, 3000, 0.5),
                new Water(2, "aqua")};

        Basket basket = new Basket(products);

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
