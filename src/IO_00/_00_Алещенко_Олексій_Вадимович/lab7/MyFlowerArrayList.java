package IO_00._00_Алещенко_Олексій_Вадимович.lab7;

import IO_00._00_Алещенко_Олексій_Вадимович.lab6.Flower;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyFlowerArrayList implements List<Flower> {
    private final static int INITIAL_CAPACITY = 15;
    private Flower[] flowers/* = new Flower[INITIAL_CAPACITY]*/;

    public MyFlowerArrayList() {
        flowers = new Flower[INITIAL_CAPACITY];
    }

    public MyFlowerArrayList(Flower flower) {
        this();
//        todo add realization of method "add"
        add(flower);
    }

    public MyFlowerArrayList(Collection<? extends Flower> collection) {
        flowers = new Flower[collection.size()];
//        todo add realization of method "addAll"
        addAll(collection);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Flower> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Flower flower) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Flower> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Flower> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Flower get(int index) {
        return null;
    }

    @Override
    public Flower set(int index, Flower element) {
        return null;
    }

    @Override
    public void add(int index, Flower element) {

    }

    @Override
    public Flower remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Flower> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Flower> listIterator(int index) {
        return null;
    }

    @Override
    public List<Flower> subList(int fromIndex, int toIndex) {
        return null;
    }
}
