
import java.util.Scanner;

public class printNumbersUsingRecursion {
    static void printNumbers(int n){
        if(n==0) return;

        printNumbers(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number upto which the numbers should be printed: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}
