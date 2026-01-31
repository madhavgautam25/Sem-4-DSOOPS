import java.util.Scanner;

public class spamFilterInEmailSystem {
    static String removeSpecialChar(String email, char ch){
        if(email.length() == 0) return "";

        char first = email.charAt(0);
        String rem = removeSpecialChar(email.substring(1), ch);

        if(first == ch){
            return rem;
        }else{
            return first + rem;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the email: ");
        String email = sc.nextLine();

        System.out.print("Enter the character you want to remove: ");
        String removeChar = sc.nextLine();
        char ch = removeChar.charAt(0);

        System.out.println(removeSpecialChar(email, ch));
    }
}
