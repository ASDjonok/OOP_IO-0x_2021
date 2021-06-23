package lab7.SinglyLinkedList;

public class Node<E> {
    E element;
    Node<E> next;

    public Node(E element) {
        this.element = element;
    }

    public E getElement() {
        return element;
    }
}
