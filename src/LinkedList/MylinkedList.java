package LinkedList;

public class MylinkedList {

    private class Node {
        private Node next;
        private Object data;
        public Node (Object data){
            this.data = data;
        }

        public Object getData() {
            return data;
        }

    }
    private Node head;
    private int numbernode =0;

    public MylinkedList() {
    }

    public MylinkedList(Object data) {
        head = new Node(data);
    }


    public int size (){
        return numbernode;
    }

    public Object get(int index){
        Node temp = head ;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public void add(int index , Object data){
        Node temp = head;
        Node holder;
        for (int i = 0; i < index -1 && temp.next != null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numbernode++;
    }
    public void xuat(){
        Node temp=head;
        while (temp!= null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}