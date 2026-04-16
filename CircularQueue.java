public class CircularQueue {
    static class circularQueue {
        int[] arr;
        int front;
        int rear;
        int size;
        circularQueue(int size) {
            this.size = size;
            this.arr = new int[size];
            this.front = -1;
            this.rear = -1;
        }
        public void enqueue(int data) {
            if ((rear + 1) % size == front) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }
        public void dequeue() {
            if (front == -1) {
                System.out.println("Queue is empty");
                return;
            }
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
        }
        public void display() {
            if (front == -1) {
                System.out.println("Queue is empty");
                return;
            }
            int i = front;
            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) {
                    break;
                }
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        circularQueue q = new circularQueue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}