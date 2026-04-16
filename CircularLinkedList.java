public class CircularLinkedList {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node tail = null;

    public void add(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = newNode;
            tail.next = tail;
        } else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display(){
        if(tail == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = tail.next;
        while(temp != tail){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(10);
        cll.add(20);
        cll.add(30);
        cll.add(40);

        cll.display();
    }
}
