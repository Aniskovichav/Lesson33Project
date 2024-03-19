package by.itstep.aniskovich.java.lesson33.model.enity;

public class Bread extends Product {
    private String color;
    private String flour;

    public Bread() {
        super();
    }

    public Bread(String color, String flour, double price) {
        super(price);
        this.color = color;
        this.flour = flour;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFlour() {
        return flour;
    }

    public void setFlour(String flour) {
        this.flour = flour;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "color =" + color + '\'' +
                ", flour =" + flour + '\'' +
                ", price = " + super.toString() +
                '}';
    }
}
