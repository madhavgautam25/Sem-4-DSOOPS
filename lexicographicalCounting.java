import java.util.Scanner;

public class lexicographicalCounting {
    static void lexicographical(int curr, int n){
        if(curr > n) return;

        System.out.println(curr);

        for(int i=0; i<9; i++){
            int next = curr * 10 + i;
            if(next > n) return;
            lexicographical(next, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i=1; i<=9; i++){
            lexicographical(i, n);
        }
    }
}
