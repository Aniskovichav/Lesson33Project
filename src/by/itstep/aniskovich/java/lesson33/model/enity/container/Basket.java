package by.itstep.aniskovich.java.lesson33.model.enity.container;

import by.itstep.aniskovich.java.lesson33.model.enity.Bread;
import by.itstep.aniskovich.java.lesson33.model.enity.Milk;
import by.itstep.aniskovich.java.lesson33.model.enity.Orange;

public class Basket {
    public static final int DEFAULT_SIZE = 10;

    public Orange[] oranges;
    public Milk[] milks;
    public Bread[] breads;

    public Basket() {
            oranges = new Orange[DEFAULT_SIZE];
            milks = new Milk[DEFAULT_SIZE];
            breads = new Bread[DEFAULT_SIZE];
    }

    public Basket(Orange[] oranges, Milk[] milks, Bread[] breads) {
        this.oranges = oranges;
        this.milks = milks;
        this.breads = breads;
    }


}
