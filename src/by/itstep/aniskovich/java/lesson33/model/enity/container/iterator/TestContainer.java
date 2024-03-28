package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

public class TestContainer {
    public static void main(String[] args) {

    }

    public static void test(Iterator iterator) {
        while (iterator.hasElement()) {
            System.out.println(iterator.element() + "");
        }
    }
}
