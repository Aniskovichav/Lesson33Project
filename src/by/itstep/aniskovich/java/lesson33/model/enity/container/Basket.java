package by.itstep.aniskovich.java.lesson33.model.enity.container;

import by.itstep.aniskovich.java.lesson33.model.enity.*;

import java.util.Arrays;

public class Basket {
    public static final int DEFAULT_SIZE = 10;

    private Product[] products;


    private int size = 0;

    public Basket() {
        products = new Product[0];
    }

    public Basket(Product[] products) {
        this.products = products;
        size = products.length;
    }

    public void add(Product product) {


    }

    public void remove(Product product) {

    }

    public void remove(int index) {

    }

    public Product get(int index) {

        return new Product();
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getSize() {
        return products.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of product: \n");

        for (int i = 0; i < products.length; i++) {
            builder.append(products[i]).append(;);
        }

        return "Basket{" +
                "products=" + Arrays.toString(products) +
                ", size=" + size +
                '}';
    }
}
