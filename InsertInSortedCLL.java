class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class InsertInSortedCLL {
    public static Node insert(Node head, int data){
        Node newNode = new Node(data);
        if(head == null){
            newNode.next = newNode;
            return newNode;
        }
        if(data < head.data){
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
            return newNode;
        }
        Node curr = head;
        while(curr.next != head && curr.next.data < data){
            curr = curr.next;
        }
        newNode.next = curr.next;
        curr.next = newNode;
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
        Node head = new Node(10);
        head.next = head;
        head = insert(head, 5);
        head = insert(head, 15);
        head = insert(head, 12);
        head = insert(head, 20);
        System.out.println("Sorted Circular Linked List after insertions:");
        head = insert(head, 8);
        display(head);
    }
}
