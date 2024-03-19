package by.itstep.aniskovich.java.lesson33.model.enity.container;

import by.itstep.aniskovich.java.lesson33.model.enity.Bread;
import by.itstep.aniskovich.java.lesson33.model.enity.Milk;
import by.itstep.aniskovich.java.lesson33.model.enity.Orange;
import by.itstep.aniskovich.java.lesson33.model.enity.Water;

public class Basket {
    public static final int DEFAULT_SIZE = 10;

    private Orange[] oranges;
    private Milk[] milks;
    private Bread[] breads;
    private Water[] waters;

    private int sizeMilk = 0;
    private int sizeBread = 0;
    private int sizeOrange = 0;
    private int sizeWater = 0;

    public Basket() {
            oranges = new Orange[DEFAULT_SIZE];
            milks = new Milk[DEFAULT_SIZE];
            breads = new Bread[DEFAULT_SIZE];
            waters = new Water[DEFAULT_SIZE];
    }

    public Basket(Orange[] oranges, Milk[] milks, Bread[] breads) {
        this.oranges = oranges;
        sizeOrange = oranges.length;
        this.milks = milks;
        sizeMilk = milks.length;
        this.breads = breads;
        sizeBread = breads.length;
        this.waters = waters;
        sizeWater = waters.length;
    }

    public int getSizeMilk() {
        return sizeMilk;
    }

    public int getSizeBread() {
        return sizeBread;
    }

    public int getSizeOrange() {
        return sizeOrange;
    }

    public Orange[] getOranges() {
        return oranges;
    }

    public void setOranges(Orange[] oranges) {
        this.oranges = oranges;
    }

    public Milk[] getMilks() {
        return milks;
    }

    public void setMilks(Milk[] milks) {
        this.milks = milks;
    }

    public Bread[] getBreads() {
        return breads;
    }

    public void setBreads(Bread[] breads) {
        this.breads = breads;
    }
}
