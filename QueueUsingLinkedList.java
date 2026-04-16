public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue{
        Node front;
        Node rear;

        Queue(){
            this.front = null;
            this.rear = null;
        }

        public void enqueue(int data){
            Node newNode = new Node(data);
            if(rear == null){
                front = rear = newNode;
                return;
            }
            rear.next = newNode;
            rear = newNode;
        }

        public void dequeue(){
            if(front == null){
                System.out.println("Queue is empty");
                return;
            }
            front = front.next;
            if(front == null){
                rear = null;
            }
        }

        

        public void display(){
            if(front == null){
                System.out.println("Queue is empty");
                return;
            }
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.display();
        q.dequeue();
        q.display();

    }
}
