class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
public class PairWithSum {
    public static boolean findPair(Node head, int sum){
        if(head == null) return false;
        Node left = head;
        Node right = head;
        while(right.next != null){
            right = right.next;
        }
        while(left != right){
            int currentSum = left.data + right.data;
            if(currentSum == sum){
                return true;
            } else if(currentSum < sum){
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        int sum = 70;
        boolean pair = findPair(head, sum);
        System.out.println("Pair with sum " + sum + " exists: " + pair);
    }
}
