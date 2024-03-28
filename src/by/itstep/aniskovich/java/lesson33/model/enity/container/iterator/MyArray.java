package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

public class MyArray implements Iterable{
    private int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public MyArray() {
        array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    public MyArray(int[] array) {
        this.array = array;
    }

    int getLength() {
        return array.length;
    }

    int getElement(int index) {
        return array[index];
    }

    boolean hasElement() {
        return false;
    }

    public Iterator getIterator(){
        return new MyArrayIterator(this);
    }
}
