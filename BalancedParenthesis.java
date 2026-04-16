
import java.util.Scanner;
import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Stack <Character> st = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter paranthesis sequence: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                st.push(str.charAt(i));
            }else if(str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']'){
                if(st.isEmpty()){
                    System.out.println("Parenthesis are not balanced");
                    return;
                }
                char top = st.pop();
                if((str.charAt(i) == ')' && top != '(') || (str.charAt(i) == '}' && top != '{') || (str.charAt(i) == ']' && top != '[')){
                    System.out.println("Parenthesis are not balanced");
                    return;
                }
            }

        }
        if(st.isEmpty()){
            System.out.println("Parenthesis are balanced");
        }else{
            System.out.println("Parenthesis are not balanced");
        }
    }
}
