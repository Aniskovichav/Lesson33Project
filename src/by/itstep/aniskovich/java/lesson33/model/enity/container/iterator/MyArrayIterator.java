package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

public class MyArrayIterator implements Iterator {
    private MyArray myArray;
    private int cursor = 0;

    public MyArrayIterator(MyArray myArray) {
        this.myArray = myArray;
    }

    @Override
    public int element() {
        return MyArray.getElement(cursor++);
    }

    @Override
    public boolean hasElement() {
        return false;
    }
}
