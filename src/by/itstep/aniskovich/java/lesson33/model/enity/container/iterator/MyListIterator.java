package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

public class MyListIterator implements Iterator {
    private MyList list;
    private int cursor = 0;

    public MyListIterator(MyList list) {
        this.list = list;
    }

    @Override
    public int element() {
        return list.get(cursor++);
    }

    @Override
    public boolean hasElement() {
        return cursor < list.size();
    }
}
