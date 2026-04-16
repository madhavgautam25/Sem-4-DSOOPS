import java.util.*;
public class StockSpanProblem {
    public static void main(String[] args) {
        
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = new int[prices.length];
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        System.out.println("Stock Span:");
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
