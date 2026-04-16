import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Stack: " + st);
        System.out.println("Popped element: " + st.pop());
        System.out.println("Top element is: " + st.peek());
        System.out.println("Is stack empty?: " + st.isEmpty());

    }
    
}
