
public class DLLImplementation {

    static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data){
        this.data = data;
        next = null;
        prev = null;
    }

}
    private Node head;
    private Node tail;

    public void append(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void prepend(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void deleteNode(int key){
        Node temp = head;
        while(temp != null){
            if(temp.data == key){
                if(temp.prev != null){
                    temp.prev.next = temp.next;
                } else {
                    head = temp.next;
                }
                if(temp.next != null){
                    temp.next.prev = temp.prev;
                } else {
                    tail = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DLLImplementation dll = new DLLImplementation();
        dll.append(1);
        dll.append(2);
        dll.append(3);
        dll.prepend(0);
        System.out.print("Doubly Linked List: ");
        dll.printList();

        System.out.print("Deleting node with value 2: ");
        dll.deleteNode(2);
        dll.printList();
    }
}
