import java.util.Scanner;

public class uniqueBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int res = 0;
        for(int i : arr){
            res = res ^ i;
        }

        System.out.println("Unique elements is: " + res);

    }
}
