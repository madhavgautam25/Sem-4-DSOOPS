import java.util.Scanner;

public class sumOfNaturalNumbers {
    static int sumOfNaturalNos(int n){
        
        if(n==1) return 1;

        return n + sumOfNaturalNos(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("Sum is : " + sumOfNaturalNos(n));
    }
}
