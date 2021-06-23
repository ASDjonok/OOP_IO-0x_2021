package BRI_lab7;

import java.util.*;

public class CustomDoublyLinkedList<T> implements List<T> {
    private static class Node<T> {
        T data;
        Node<T> next;
        Node<T> prev;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (o.equals(current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>();
    }

    private class CustomIterator<E> implements Iterator<E> {
        Node<T> current = head;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        @SuppressWarnings("unchecked")
        public E next() {
            E nextElement = (E) current.data;
            current = current.next;
            return nextElement;
        }
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }

    @Override
    @SuppressWarnings("unchecked")
    public <E> E[] toArray(E[] a) {
        if (a.length >= size) {
            Node<T> current = head;
            int index = 0;
            while (current != null) {
                a[index] = (E) current.data;
                current = current.next;
                index++;
            }
        }
        return a;
    }

    @Override
    public boolean add(T t) {
        Node<T> newNode = new Node<T>(t);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
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
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
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
        size = 0;
        head = tail = null;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return goToNode(index).data;
    }

    private Node<T> goToNode(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    // Return old value of this node
    public T set(int index, T element) {
        Objects.checkIndex(index, size);
        T oldValue = goToNode(index).data;
        goToNode(index).data = element;
        return oldValue;
    }

    @Override
    public void add(int index, T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = tail = newNode;
        } else if (index == 0) {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        } else if (index == size) {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        } else {
            Node<T> previous = goToNode(index - 1);
            newNode.prev = previous;
            newNode.next = previous.next;
            previous.next = newNode;
        }
        size++;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (o.equals(current.data)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<T> current = tail;
        for (int i = size; i > 0; i--) {
            if (o.equals(current.data)) {
                return i;
            }
            current = current.prev;
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
