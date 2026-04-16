import java.util.*;

public class DuplicateEmailDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> emails = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String email = sc.nextLine();
            emails.add(email);
        }

        System.out.println(emails.size());
    }
}