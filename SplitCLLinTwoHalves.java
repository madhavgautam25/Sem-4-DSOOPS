class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SplitCLLinTwoHalves {
    public static void insert(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    public static Node split(Node head){
        if(head == null) return null;
        Node slow = head;
        Node fast = head;
        while(fast.next != head && fast.next.next != head){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next.next == head){
            fast = fast.next;
        }
        Node head1 = head;
        Node head2 = slow.next;
        slow.next = head1;
        fast.next = head2;
        
        return head;
    }

    public static void display(Node head){
        if(head == null) return;
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = head;
        insert(head, 2);
        insert(head, 3);
        insert(head, 4);
        insert(head, 5);

        System.out.println("Original Circular Linked List:");
        display(head);

        Node head1 = split(head);
        System.out.println("First half:");
        display(head1);

        Node head2 = head1.next;
        System.out.println("Second half:");
        display(head2);
    }
}
