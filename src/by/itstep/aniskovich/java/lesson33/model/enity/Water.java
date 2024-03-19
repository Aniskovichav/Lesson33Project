package by.itstep.aniskovich.java.lesson33.model.enity;

public class Water  extends  Product {
    private String name;

    public Water() {
        super();
    }

    public Water(String name, double price) {
        super(price);
        this.name = name;
    }

    public Water(double price, String name) {
        super(price);
        this.name = name;
    }
}
