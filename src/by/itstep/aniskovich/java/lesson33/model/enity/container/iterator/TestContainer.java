package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

public class TestContainer {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyArray myArray = new MyArray();

        Iterator[] iterators = {new MyListIterator(list),
                new MyArrayIterator(myArray),
                new ReverseMyArrayIterator(myArray)};

        test(iterators);
    }

    public static void test(Iterator... iterators) {
        for (Iterator iterator : iterators) {
            while (iterator.hasElement()) {
                System.out.print(iterator.element() + "");
            }
            System.out.println();
        }

    }
}
