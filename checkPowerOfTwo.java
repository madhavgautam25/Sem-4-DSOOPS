import java.util.Scanner;

public class checkPowerOfTwo {
    static boolean check(int n){
        if(n>0 && (n & (n-1)) == 0){
            return true;
        }
        return  false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if(check(n)){
            System.out.println("Yes, the given number is power of 2");
        }else{
            System.out.println("No, given number is not the power of 2");
        }
    }

}
