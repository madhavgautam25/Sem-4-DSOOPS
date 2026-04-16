import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
public class insertion {
    
    public static Node insertionAtHead(int data, Node head){
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static void insertionAtEnd(int data, Node head){
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public static void display(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data +  " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = insertionAtHead(5, head);

        insertionAtEnd(50, head);

        display(head);

    }
}
