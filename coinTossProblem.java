import java.util.Scanner;

public class coinTossProblem {
    static  void coinToss(int n, String res){
        if(n == 0){
            System.out.println(res);
            return;
        }

        coinToss(n-1, res + 'H');
        coinToss(n-1, res + 'T');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times a coin tossed : ");
        int n = sc.nextInt();

        coinToss(n, " ");

    }
}
