import java.util.*;
public class DequeUsingArrayDeque {
    public static void main(String[] args) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(1);
        dq.addLast(2);
        dq.addFirst(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);

    }
}
