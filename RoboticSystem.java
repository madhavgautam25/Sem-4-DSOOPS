import java.util.Scanner;
public class RoboticSystem {
    static int totalWays(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return totalWays(n-1) + totalWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int n = sc.nextInt();
        System.out.println("Total number of ways: " + totalWays(n));
    }
}
