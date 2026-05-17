import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class TreeOperations {

    ArrayList<Integer> levelOrder(Node root) {

        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            result.add(current.data);

            if (current.left != null) {
                queue.add(current.left);
            }

            if (current.right != null) {
                queue.add(current.right);
            }
        }

        return result;
    }
}

public class LevelOrderTraversal {

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        // Create object
        TreeOperations s = new TreeOperations();

        // Call method
        ArrayList<Integer> result = s.levelOrder(root);

        // Display result
        System.out.println("Level Order Traversal = " + result);
    }
}