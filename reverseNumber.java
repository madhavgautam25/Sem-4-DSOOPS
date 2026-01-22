import java.util.Scanner;

public class reverseNumber {
    static int revNum = 0;

    static void rev(int n){
        if (n == 0) return;

        revNum = revNum * 10 + (n % 10);
        rev(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        rev(n);
        System.out.println("Reversed number: " + revNum);
    }
}
