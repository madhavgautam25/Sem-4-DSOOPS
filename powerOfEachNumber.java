import java.util.Scanner;

public class powerOfEachNumber {
    static int power(int base, int exp){
        if(exp == 0) return 1;

        return base * power(base, exp-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = sc.nextInt();
        System.out.print("Enter the exp : ");
        int exp = sc.nextInt();

        System.out.println(power(base, exp));
    }
}
