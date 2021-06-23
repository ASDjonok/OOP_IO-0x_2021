package lab7.ArrayList;

import java.util.*;

public class CollectionArrayList<E> implements List<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 15;
    private Object[] elements;

    public CollectionArrayList(int initCapacity) {
        this.elements = new Object[initCapacity];
    }

    public CollectionArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public CollectionArrayList(Collection<? extends E> collection) {
        this.elements = new Object[collection.size()];
        addAll(collection);
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
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index != size;
            }

            @SuppressWarnings("unchecked")
            @Override
            public E next() {
                E temp = (E) elements[index];
                index++;
                return temp;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T[] toArray(T[] a) {
        if (a.length > elements.length) {
            Object[] newArray = new Object[size + a.length];
            System.arraycopy(elements,0,newArray,0,elements.length);
            elements = newArray;
        }
        return (T[]) elements;
    }

    @Override
    public boolean add(E e) {
        resizeIfNeeded();
        elements[size] = e;
        size++;
        return true;
    }

    private boolean resizeIfNeeded() {
        if (elements.length == size) {
            Object[] newArray = new Object[(int) (elements.length * 1.3)];
            System.arraycopy(elements, 0, newArray, 0, size);
            elements = newArray;
            return true;
        }
        return false;
    }


    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i].equals(o)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object colElem:c) {
            boolean entryChecker = false;
            for (int i = 0; i < elements.length; i++) {
                if (colElem.equals(elements[i])) {
                    entryChecker = true;
                }
            }
            if (!entryChecker) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (c.size() == 0) {
            return false;
        }
        Object[] givenArr = c.toArray();

        Object[] newArray = new Object[givenArr.length + size];
        System.arraycopy(elements,0,newArray,0,size);
        System.arraycopy(givenArr,0,newArray,size,givenArr.length);
        elements = newArray;
        size += givenArr.length;
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        if (c.size() == 0) {
            return false;
        }
        if (index < 0) {
            return false;
        }

        Object[] givenArr = c.toArray();
        Object[] newArray;
        if (index > size) {
            newArray = new Object[givenArr.length + index];
            System.arraycopy(elements,0,newArray,0, index);
            System.arraycopy(givenArr,0,newArray, index, givenArr.length);
            elements = newArray;
            size += givenArr.length+(index-size);
        } else {
            newArray = new Object[givenArr.length + size];
            System.arraycopy(elements,0,newArray,0, index);
            System.arraycopy(givenArr,0,newArray, index, givenArr.length);
            System.arraycopy(elements,index,newArray, index+givenArr.length, size - index);
            elements = newArray;
            size += givenArr.length;
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object colElem:c) {
            for (int i = 0; i < size; i++) {
                if (colElem.equals(elements[i])) {
                    System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                    size--;
                }
            }
        }
        return true;
    }


    @Override
    public boolean retainAll(Collection<?> c) {
        CollectionArrayList<E> newArr = new CollectionArrayList<E>();

        for (Object colElem:c) {
            for (int i = 0; i < size; i++) {
                if (colElem.equals(elements[i])) {
                    newArr.add((E) elements[i]);
                }
            }
        }
        elements = newArr.toArray();
        size = newArr.size();
        return true;
    }

    @Override
    public void clear() {
        size = 0;
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    @SuppressWarnings("unchecked")
    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    @SuppressWarnings("unchecked")
    public E set(int index, E element) {
        Object temp = elements[index];
        elements[index] = element;
        return (E) temp;
    }

    @Override
    public void add(int index, E element) {
        // todo check index
        resizeIfNeeded();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    @Override
    @SuppressWarnings("unchecked")
    public E remove(int index) {
        // todo check index
        Object removedElement = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
        return (E) removedElement;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < elements.length; i++) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = elements.length - 1; i >= 0; i--) {
            if (o.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<E> subList(int fromIndex, int toIndex) {
        //todo checking indices
        Object[] newArray = Arrays.copyOfRange(elements, fromIndex, toIndex);
        return (List<E>) Arrays.asList(newArray);
    }

    public void print() {
        Object[] cleanArr = Arrays.copyOf(elements, size);
        for (Object o:cleanArr) {
            System.out.print(o+" ");
        }
    }
}
