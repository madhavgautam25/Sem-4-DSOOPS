import java.util.Scanner;
import java.util.Stack;
public class ReverseUsingStack {
    public static void main(String[] args) {
        Stack <Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            st.push(str.charAt(i));
        }

        String revStr = "";

        while(!st.isEmpty()){
            revStr += st.pop();
        }

        System.out.println("Reverse String: " + revStr);

    }
}
