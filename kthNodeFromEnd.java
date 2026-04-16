class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class kthNodeFromEnd {
    Node head;
    public int findKthFromEnd(int k){
        if(head == null) return -1;

        Node slow = head;
        Node fast = head;

        for(int i = 0; i < k; i++){
            if(fast == null) return -1;
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        kthNodeFromEnd kthNode = new kthNodeFromEnd();
        kthNode.head = head;
        int k = 2;
        int kthValue = kthNode.findKthFromEnd(k);
        System.out.println(k + "th node from end value: " + kthValue);
    }
}
