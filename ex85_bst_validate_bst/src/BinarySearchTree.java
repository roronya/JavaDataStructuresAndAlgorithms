import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;


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

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    // WRITE KTHSMALLEST METHOD HERE //
    public Integer kthSmallest(int k) {
        var node = root;
        var stack = new Stack<Node>();
        while(node != null) {
            stack.push(node);
            node = node.left;
        }
        // node is null now
        for(int i=0;i<k;i++) {
            // System.out.println(Arrays.toString(stack.stream().map(n -> n.value).toArray()));
            node = stack.pop();
            if (node.right != null) {
                var ni = node.right;
                while(ni != null) {
                    stack.push(ni);
                    ni = ni.left;
                }
            }
        }
        return node == null ? null : node.value;
    }

}
