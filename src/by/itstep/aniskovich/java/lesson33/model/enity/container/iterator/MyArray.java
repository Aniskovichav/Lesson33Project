package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

public class MyArray {
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

    int getElement() {
        return array[i];
    }

    boolean hasElement() {
        return false;
    }
}
