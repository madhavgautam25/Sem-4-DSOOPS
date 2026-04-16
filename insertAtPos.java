class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class insertAtPos {
    
    public static void insertAtPosition(Node head, int data, int pos) {
        Node newNode = new Node(data);

        if (pos == 1) {
            newNode.next = head;
            // return newNode;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position is invalid.");
            // return head;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        // return head;
    }

    public static void display(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int data = 25;
        int pos = 3;

        insertAtPosition(head, data, pos);

        display(head);
    }
}
