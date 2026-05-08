class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class AncestorsOfBinaryTree {
    Node root;
    AncestorsOfBinaryTree() {
        root = null;
    }
    
    static boolean printAncestors(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.data == target) {
            return true;
        }
        if (printAncestors(node.left, target) || printAncestors(node.right, target)) {
            System.out.print(node.data + " ");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AncestorsOfBinaryTree tree = new AncestorsOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        int target = 5;
        System.out.println("Ancestors of node " + target + ":");
        printAncestors(tree.root, target);
    }
}
