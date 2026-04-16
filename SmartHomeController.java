import java.util.Scanner;
public class SmartHomeController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of devices: ");
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(n^(1<<k));
        
    }
}
