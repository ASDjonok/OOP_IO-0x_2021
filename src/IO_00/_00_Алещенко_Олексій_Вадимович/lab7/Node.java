package IO_00._00_Алещенко_Олексій_Вадимович.lab7;

import IO_00._00_Алещенко_Олексій_Вадимович.lab6.Flower;

public class Node {
    private Flower flower;
    private Node next;

    public Node(Flower flower, Node next) {
        this.flower = flower;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public boolean contains(Object o) {
        return flower.equals(o);
    }

    public Flower getFlower() {
        return flower;
    }
}
