public class BinarySearchTree {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    // WRITE INSERT METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////
    public boolean insert(int value) {
        var newNode = new Node(value) ;
        if (root == null) {
            root = newNode;
            return true;
        }
        var temp = root;
        while (true) {
            if (newNode.value == temp.value) {
                return false;
            }
            if (newNode.value < temp.value) {
                if (root.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (root.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

}