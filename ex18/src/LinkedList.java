public class LinkedList {

    private Node head;
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
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
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
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
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
        }
        length++;
    }

    // WRITE THE REVERSEBETWEEN METHOD HERE //
    //                                      //
    //                                      //
    //                                      //
    //                                      //
    //////////////////////////////////////////
    public void reverseBetween(int m, int n) {
        if (head == null) {
            return;
        }

        var dummyHead = new Node(-1);
        dummyHead.next = head;

        var preM = dummyHead; // 普通にforするとmまで行ってしまう。preMがほしいからdummyHeadから開始する
        for (int i = 0; i < m; i++) {
            preM = preM.next;
        }

        var mNode = preM.next;
        var nNode = mNode.next; // m < n だからこれはnullじゃない
        for (int i = 0; i < m - n; i++) {
            var postN = nNode.next; // m < nよりpostNがnullのとき i == m-n
            preM.next = postN;
            nNode.next = mNode;
            mNode.next = postN;
        }
        head = dummyHead.next;
    }
}