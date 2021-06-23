package BRI_lab7;

import java.util.*;

public class CustomSinglyLinkedList<T> implements List<T> {
    private static class Node<T> {
        private T data;
        private Node<T> next;

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
    // todo: implement this method
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
        head = tail = null;
    }

    @Override
    public T get(int index) {
        Objects.checkIndex(index, size);
        return goToNode(index).data;
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
        Objects.checkIndex(index, size);
        Node<T> newNode = new Node<T>(element);
        if (isEmpty()) {
            head = tail = newNode;
        } else if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else if (index == size) {
            tail.next = newNode;
            tail = newNode;
        } else {
            Node<T> previous = goToNode(index - 1);
            newNode.next = previous.next;
            previous.next = newNode;
        }
        size++;
    }

    private Node<T> goToNode(int index) {
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    // Return value of this node
    public T remove(int index) {
        Objects.checkIndex(index, size);
        T value;
        if (index == 0) {
            value = head.data;
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            Node<T> previous = goToNode(index - 1);
            value = previous.next.data;
            previous.next = previous.next.next;
            if (index == size - 1) {
                tail = previous;
            }
        }
        size--;
        return value;
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
        for (int i = size - 1; i >= 0; i--) {
            if (current.data.equals(o)) {
                return i;
            }
            current = goToNode(i - 1);
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
