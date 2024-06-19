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
    public void swapPairs() {
        if (length == 0 || length == 1) {
            return;
        }
        // 奇数子の配列のときペアにならないやつがいるから処理しない
        if (length % 2 == 1) {
            return;
        }

        var temp = head;
        for(int i = 0; i < length; i++) {
            var nextTemp = temp.next;

            if (i % 2 == 0) { // 2,4,6,...
                temp.prev = temp.next;
                if (temp.next == null || temp.next.next == null) {
                    temp.next = null;
                } else {
                    temp.next = temp.next.next.next;
                }
            } else { // 1,3,5,...
                temp.next = temp.prev;
                if (temp.prev.prev == null){
                    temp.prev = null;
                } else {
                    temp.prev = temp.prev.prev.prev;
                }
            }

            temp = nextTemp;
        }
        head = head.prev;
    }
}

