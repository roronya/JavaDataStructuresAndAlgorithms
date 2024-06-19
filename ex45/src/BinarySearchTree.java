public class BinarySearchTree {

    // CREATE CLASS VARIABLE (ROOT) AND NODE CLASS HERE//
    //                                                 //
    //                                                 //
    //                                                 //
    //                                                 //
    /////////////////////////////////////////////////////
    class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public Node getRoot() {
        return root;
    }

}
