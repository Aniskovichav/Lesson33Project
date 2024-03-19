package by.itstep.aniskovich.java.lesson33.model.logic;

import by.itstep.aniskovich.java.lesson33.model.enity.Bread;
import by.itstep.aniskovich.java.lesson33.model.enity.Milk;
import by.itstep.aniskovich.java.lesson33.model.enity.Orange;
import by.itstep.aniskovich.java.lesson33.model.enity.Water;
import by.itstep.aniskovich.java.lesson33.model.enity.container.Basket;

public class ShopAssistance {
    public static double calculateTotalPrice(Basket basket) {
        if (basket == null || (basket.getSizeOrange() == 0
                && basket.getSizeMilk() == 0
                && basket.getSizeBread() == 0
                && basket.getSizeWater() == 0)) {
            return -1;
        }

        double total = 0;

        for (Orange orange: basket.getOranges()) {
            total += orange.getCost();
        }

        for (Milk milk: basket.getMilks()) {
            total += milk.getMoney();
        }

        for (Bread bread: basket.getBreads()) {
            total += bread.getPrice();
        }

        for (Water water : basket.getWaters()) {
            total += water.getPrice();
        }

        return total;
    }
}
