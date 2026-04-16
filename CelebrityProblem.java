import java.util.*;
public class CelebrityProblem {
    static  boolean knows(int a, int b, int[][] arr){
        return arr[a][b] == 1;
    }

    public static int findCelebrity(int[][] arr, int n) {
        Stack <Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();
            if (knows(a, b, arr)) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        int people = st.pop();
        for (int i = 0; i < n; i++) {
            if (i != people && (knows(people, i, arr) || !knows(i, people, arr))) {
                return -1;
            }
        }
        return people;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {0, 1, 0},
            {0, 0, 0},
            {0, 1, 0}
        };
        int n = arr.length;
        int celebrity = findCelebrity(arr, n);
        if (celebrity == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("Celebrity is person " + celebrity);
        }
    }
}