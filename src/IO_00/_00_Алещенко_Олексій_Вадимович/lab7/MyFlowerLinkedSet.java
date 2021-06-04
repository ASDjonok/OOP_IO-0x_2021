package IO_00._00_Алещенко_Олексій_Вадимович.lab7;

import IO_00._00_Алещенко_Олексій_Вадимович.lab6.Flower;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyFlowerLinkedSet implements Set<Flower> {
    private Node head;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(Object o) {
        /*Node current = head;
        while (current != null) {
            if (current.contains(o)) {
                return true;
            } else {
                current = current.getNext();
            }
        }*/
        for (Flower flower : this) {
            if (flower.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Flower> iterator() {

//        todo add bodies to methods of anonymous class
        return new Iterator<Flower>() {
            private Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Flower next() {
                Flower result = current.getFlower();
                current = current.getNext();
                return result;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Flower flower) {
        if (!contains(flower)) {
            head = new Node(flower, head);
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
