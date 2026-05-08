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
public class ReverseDLL {

    public static void append(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public static void prepend(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    public static Node reverse(Node head){
        Node curr = head;
        Node temp = null;
        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
        return head;
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        append(head, 20);
        append(head, 30);
        append(head, 40);

        System.out.println("Original List:");
        display(head);

        head = reverse(head);

        System.out.println("Reversed List:");
        display(head);
    }
}
