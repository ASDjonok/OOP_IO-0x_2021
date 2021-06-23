package lab7.SinglyLinkedList;

import java.util.*;

public class SinglyLinkedList<E> implements List<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

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
        for (Object f : this) {
            if (f.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public E next() {
                E elem = current.getElement();
                current = current.next;
                return elem;
            }
        };
    }

    @Override
    public Object[] toArray() {
        ArrayList<E> arr = new ArrayList<>();
        for (E elem : this) {
            arr.add(elem);
        }
        return arr.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e);
        if (first == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        remove(this.indexOf(o));
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object elem:c) {
            boolean entryCheckerElement = false;
            Node<E> current = first;
            while (iterator().hasNext()) {
                if (elem.equals(current.element)) {
                    entryCheckerElement = true;
                }
                current = current.next;
            }
            if (!entryCheckerElement) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
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
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        return getNodeByIndex(index).element;
    }


    @Override
    public E set(int index, E element) {
        Node<E> node = getNodeByIndex(index);
        node.element = element;
        return node.element;
    }

    @Override
    public void add(int index, E element) {
        Node<E> newNode = new Node<>(element);
        if (first == null) {
            first = last = newNode;
        } else if (index == 0) {
            newNode.next = first;
            first = newNode;
        } else if (index == size) {
            last.next = newNode;
            last = newNode;
        } else {
            Node<E> prev = getNodeByIndex(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    private Node<E> getNodeByIndex(int index) {
        Node<E> current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public E remove(int index) {
        E removedElement;
        if (index == 0) {
            removedElement = first.element;
            first = first.next;
            if (first == null) {
                last = null;
            }
        } else {
            Node<E> prev = getNodeByIndex(index - 1);
            removedElement = prev.next.element;
            prev.next = prev.next.next;
            if (index == size - 1) {
                last = prev;
            }
        }
        size--;
        return removedElement;
    }

    @Override
    public int indexOf(Object o) {
        Node<E> current = first;
        for (int i = 0; i < size; i++) {
            if (current.element.equals(o)) {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<E> current = last;
        for (int i = size - 1; i >= 0; i--) {
            if (current.element.equals(o)) {
                return i;
            }
            current = getNodeByIndex(i - 1);
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
    public List<E> subList(int fromIndex, int toIndex) {
        ArrayList<E> arr = new ArrayList<>();
        Node<E> elem = getNodeByIndex(fromIndex);
        Node<E> current = first;
        while (!elem.equals(current)) {
            current = current.next;
//            System.out.println(current.element+" = element");
        }
        for (int i = 0; i < toIndex - fromIndex; i++) {
            arr.add(current.element);
            current = current.next;
        }
        return arr;
    }

    public void print() {
        Node<E> temp = first;
        while (temp != null) {
            System.out.print(temp.element + " ");
            temp = temp.next;
        }
    }
}
