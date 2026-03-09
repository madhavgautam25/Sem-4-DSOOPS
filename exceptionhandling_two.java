import java.util.Scanner;

public class exceptionhandling_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int n2 = sc.nextInt();

        if(n2 == 0){
            throw new ArithmeticException("Oops! Division by zero is not possible.");
        }else{
        int divide = n1/n2;
        System.out.println("Divide " + n1 + " by " + n2 + " : " + divide);
        }
        
    }
}
