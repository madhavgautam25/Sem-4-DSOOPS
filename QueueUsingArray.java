public class QueueUsingArray {
    static class Queue{
        int arr[];
        int size;
        int rear;
        int front;

        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public void enqueue(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
            if(front == -1){
                front++;
            }
        }

        public void dequeue(){
            if(front == -1 || front > rear){
                System.out.println("Queue is empty");
                return;
            }
            front++;
        }

        public void display(){
            if(front == -1 || front > rear){
                System.out.println("Queue is empty");
                return;
            }
            for(int i=front; i<=rear; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.display();

    }
}
