public class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        length++;
    }

    // WRITE THE SWAPPAIRS METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public void ansSwapPairs() {
        Node dh = new Node(0);
        dh.next = head;
        Node pre = dh;

        while (head != null && head.next != null) {
            Node p1 = head;
            Node p2 = head.next;

            pre.next = p2;
            p1.next = p2.next;
            p2.next = p1;

            p2.prev = pre;
            p1.prev = p2;

            if (p1.next != null) {
                p1.next.prev = p1;
            }

            head = p1.next;
            pre = p1;
        }

        head = dh.next;
        if (head != null) head.prev = null;
    }

    public void swapPairs() {
        if (length == 0 || length == 1) {
            return;
        }

        var dh = new Node(0);
        dh.next = head;

        var pre = dh;
        var p1 = pre.next;
        var p2 = p1.next;
        while (true) {
            pre.next = p2;
            p1.next = p2.next;
            p2.next = p1;

            p1.prev = p2;
            p2.prev = pre;
            if (p1.next  != null) {
                p1.next.prev = p1;
            }

            if (p1.next == null || p1.next.next == null) {
                break;
            }
            pre = p1;
            p1 = p1.next;
            p2 = p1.next;
        }

        head = dh.next;
        if (head != null) head.prev = null;
    }
}

