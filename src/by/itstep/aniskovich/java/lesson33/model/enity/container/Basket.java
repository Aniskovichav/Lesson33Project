package by.itstep.aniskovich.java.lesson33.model.enity.container;

import by.itstep.aniskovich.java.lesson33.model.enity.*;

public class Basket {
    public static final int DEFAULT_SIZE = 10;

    private Product[] products;


    private int size = 0;

    public Basket() {
        products = new Product[DEFAULT_SIZE];
    }

    public Basket(Product[] products) {
        this.products = products;
        size = products.length;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
