import java.util.Scanner;

public class towerOfHanoi{
    static void toh(int n, char s, char h, char d){
        if(n == 0){
            return;
        }

        toh(n-1, s, d, h);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
        toh(n-1, h, s, d);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks : ");
        int n = sc.nextInt();
        toh(n, 'S', 'H', 'D');
    }
}