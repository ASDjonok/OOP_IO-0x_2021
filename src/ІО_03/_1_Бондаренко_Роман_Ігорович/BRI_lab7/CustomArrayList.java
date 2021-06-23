package BRI_lab7;

import java.util.*;

public class CustomArrayList<T> implements List<T> {
    private static final int DEFAULT_CAPACITY = 15;
    private Object[] elements;
    private int size;

    public CustomArrayList(int initCapacity) {
        if (initCapacity > 0) {
            this.elements = new Object[initCapacity];
        } else {
            throw new IllegalArgumentException("Illegal argument: " + initCapacity);
        }
    }

    public CustomArrayList() {
        this(DEFAULT_CAPACITY);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object o1 : elements) {
            if (o.equals(o1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>();
    }

    private class CustomIterator<E> implements Iterator<E> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        @SuppressWarnings("unchecked")
        public E next() {
            E nextElement = (E) elements[index];
            index++;
            return nextElement;
        }
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <E> E[] toArray(E[] a) {
        if (a.length >= size) {
            System.arraycopy(elements, 0, a, 0, size);
        } else {
            throw new ArrayStoreException("Given array is too small");
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        resizeIfNeeded();
        elements[size] = t;
        size++;
        return true;
    }

    private void resizeIfNeeded() {
        if (size == elements.length) {
            Object[] newArray = new Object[(int) (DEFAULT_CAPACITY + DEFAULT_CAPACITY * 0.3)];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
        }
    }

    @Override
    public boolean remove(Object o) {
        if (contains(o)) {
            remove(indexOf(o));
            return true;
        }
        return false;
    }

    @Override
    // todo: implement this method
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    // todo: implement this method
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    // todo: implement this method
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    // todo: implement this method
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    @SuppressWarnings("unchecked")
    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    @Override
    @SuppressWarnings("unchecked")
    // Return old value of this index
    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        T oldValue = (T) elements[index];
        elements[index] = element;
        return oldValue;
    }

    @Override
    public void add(int index, T element) {
        Objects.checkIndex(index, size);
        resizeIfNeeded();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    // Return removed element
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T removedElement = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return removedElement;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    // todo: implement this method
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    // todo: implement this method
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    // todo: implement this method
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
