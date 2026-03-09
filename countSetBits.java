import java.util.Scanner;

public class countSetBits {
    static int count(int n){
        int i = 0;
        int c = 0;

        while(n>>i > 0){
            if(((n>>i) & 1) == 1){
                c++;
            }
            i++;
        }
        return c;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Count of 1s in the given number: " + count(n));
    }
}
