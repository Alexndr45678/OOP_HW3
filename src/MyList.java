import java.util.Iterator;

public class MyList <E>{
    private Node head;
    public void LinkedList() {
        head = null;
    }

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        }
        else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void remove(int data) {
        Node curNode = head;
        Node prevNode = null;

        while (curNode.next != null) {

            if (curNode.data == data) {
                if (curNode == head) {
                    head = curNode.next;
                }
                else {
                    prevNode.next = curNode.next;
                }
            }
            prevNode= curNode;
            curNode = curNode.next;
        }
    }

    public void print () {
        Node current = head;
        if (head != null) {
            System.out.println(head.data);
        }
        while (current.next != null) {
            current = current.next;
            System.out.println(current.data);
        }
    }
}

