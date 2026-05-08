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
public class HeightOfBinaryTree {

    Node root;
    HeightOfBinaryTree() {
        root = null;
    }
    

    static int height(Node root){
        if(root == null) return 0;
    
        return 1 + Math.max(height(root.left), height(root.right));
    }

    static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    static boolean find(Node root, int key){
        if(root == null) return false;

        if(root.data == key) return true;

        return find(root.left, key) || find(root.right, key);
    }

    static int findSum(Node root){
        if(root == null) return 0;

        return root.data + findSum(root.left) + findSum(root.right);
    }

    public static void main(String[] args) {
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of the binary tree: " + height(tree.root));
        System.out.println("Maximum value in the binary tree: " + max(tree.root));
        int key = 5;
        System.out.println("Is " + key + " present in the binary tree? " +find(tree.root, key));
        System.out.println("Sum of all nodes in the binary tree: " + findSum(tree.root));


    }

}