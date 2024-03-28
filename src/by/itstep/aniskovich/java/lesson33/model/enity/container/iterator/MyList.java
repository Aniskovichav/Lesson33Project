package by.itstep.aniskovich.java.lesson33.model.enity.container.iterator;

import java.util.LinkedList;

public class MyList implements Iterable{
    private LinkedList<Integer> list;

    public MyList() {
        list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
    }

    public MyList(LinkedList<Integer> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public int get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator getIterator() {
        return new MyListIterator(this);
    }
}
