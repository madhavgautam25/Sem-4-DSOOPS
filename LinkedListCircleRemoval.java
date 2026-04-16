class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
public class LinkedListCircleRemoval {
    public static void createCycle(Node head, int pos){
        if(pos == 0) return;
        Node temp = head;
        Node startNode = null;
        int count = 1;
        while(temp.next != null){
            if(count == pos){
                startNode = temp;
            }
            temp = temp.next;
            count++;
        }
        temp.next = startNode;
    }

    public static boolean detectCycle(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;

        do{
            slow = slow.next;
            fast = fast.next.next;
        } while(slow != fast);

        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        createCycle(head, 2);

        System.out.println("Cycle detected: " + detectCycle(head));

        removeCycle(head);

        System.out.println("Cycle detected after removal: " + detectCycle(head));
    }
}
