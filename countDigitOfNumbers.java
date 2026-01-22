import java.util.Scanner;

public class countDigitOfNumbers {
    
    static int countDigit(int n){
        if(n==0) return 0;
        
        return 1 + countDigit(n/10);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Count of digits: " + countDigit(n));
    }
}
