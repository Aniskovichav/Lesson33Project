package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

public class TestContainer {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyArray myArray = new MyArray();
        test(list, myArray);
    }

    public static void test(Iterable... iterables) {
        for (Iterable iterable : iterables) {
            Iterator iterator = iterable.getIterator();

            while (iterator.hasElement()) {
                System.out.print(iterator.element() + "");
            }
            System.out.println();
        }

    }
}
