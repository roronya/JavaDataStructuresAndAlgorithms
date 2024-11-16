import java.util.Stack;

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

    // WRITE INSERTIONSORT METHOD HERE //
    public void insertionSort() {
        if (length < 2) return;

        var n = head;
        while(n != null) {
            var m = n;
            var stack = new Stack<Node>();
            while (m != null) {
                stack.push(m);
                m = m.next;
            }
            while (stack.size() > 1) {
                var m1 = stack.pop();
                var m2 = stack.pop();
                if (m1.value < m2.value) {
                    var tmp = m1.value;
                    m1.value = m2.value;
                    m2.value = tmp;
                }
                stack.push(m2);
            }
            n = n.next;
        }
    }

}