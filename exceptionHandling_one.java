import java.util.Scanner;

public class exceptionHandling_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        try {
            int divide = n1/n2;
            System.out.println("Divide" + n1 + " by " + n2 + " : " + divide);
        } catch (Exception e) {
            System.out.println("Oops! Division by zero is not possible.");
        }
    }
}
