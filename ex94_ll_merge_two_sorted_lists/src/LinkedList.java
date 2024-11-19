public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // WRITE MERGE METHOD HERE //
    public void merge(LinkedList l) {
        var n = head;
        var m = l.head;
        Node current = new Node(-1);
        head = current;
        while (n != null && m != null) {
            if (n.value < m.value) {
                current.next = n;
                n = n.next;
            } else {
                current.next = m;
                m = m.next;
            }
            current = current.next;
        }
        while (n != null) {
            current.next = n;
            n = n.next;
            current = current.next;
        }
        while (m != null) {
            current.next = m;
            m = m.next;
            current = current.next;
        }
        head = head.next;
        tail = current;
    }

}


