package Queue;

public class Node <E>{
    public int key;
    private Node<E> next;

    public Node() {
    }

    public Node(int key) {
        this.key = key;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
