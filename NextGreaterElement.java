import java.util.*;
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] nge = new int[arr.length];

        Stack<Integer> st = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        System.out.print("Next Greater Elements: ");
        for (int i = 0; i < nge.length; i++) {
            System.out.print(nge[i] + " ");
        }
    }
}