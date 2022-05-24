package Queue;

import java.util.Queue;

public class MyLinkedListQueue<E> {
    private Node<E> head;
    private Node<E> tail;

    public MyLinkedListQueue() {
    }

    public MyLinkedListQueue(Node<E> head, Node<E> tail) {
        this.head = head;
        this.tail = tail;
    }
    public void enqueue ( int key){
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.setNext(temp);
        this.tail = temp;
    }
    public Node dequeue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.getNext();
        if (this.head == null)
            this.tail = null;
        return temp;
    }



}
