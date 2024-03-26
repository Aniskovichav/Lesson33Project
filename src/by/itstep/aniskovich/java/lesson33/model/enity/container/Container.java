package by.itstep.aniskovich.java.lesson33.model.enity.container;

import by.itstep.aniskovich.java.lesson33.model.enity.Product;

public interface Container {
    void add(Product product);
    void remove(Product product);
    void remove(int index);
    Product get(int index);
    int size();
}
