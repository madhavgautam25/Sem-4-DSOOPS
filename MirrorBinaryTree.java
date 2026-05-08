class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class MirrorBinaryTree {
    Node root;
    MirrorBinaryTree() {
        root = null;
    }
    
    public Node mirror(Node node) {
        if (node == null) {
            return null;
        }
        Node left = mirror(node.left);
        Node right = mirror(node.right);
        node.left = right;
        node.right = left;
        return node;
    }

    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }


    public static void main(String[] args) {
        MirrorBinaryTree tree = new MirrorBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of the original binary tree:");
        tree.inorder(tree.root);

        tree.mirror(tree.root);

        System.out.println("\nInorder traversal of the mirrored binary tree:");
        tree.inorder(tree.root);
    }
}
