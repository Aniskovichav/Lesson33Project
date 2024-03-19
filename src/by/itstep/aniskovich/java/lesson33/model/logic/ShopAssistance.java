package by.itstep.aniskovich.java.lesson33.model.logic;

import by.itstep.aniskovich.java.lesson33.model.enity.*;
import by.itstep.aniskovich.java.lesson33.model.enity.container.Basket;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket) {
        if (basket == null || (basket.getSize() == 0)) {
            return -1;
        }

        double total = 0;

        for (Product product : basket.getProducts()) {
            total += product.getPrice();
        }

        return total;
    }
}
