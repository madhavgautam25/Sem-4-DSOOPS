import java.util.Scanner;

public class warehouseRearrangement {
    static void reverseArray(int[] packages, int start, int end){
        if(start > end) return;

        int temp = packages[start];
        packages[start] = packages[end];
        packages[end] = temp;

        reverseArray(packages, start+1, end-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] packages = new int[n];

        System.out.print("Enter the order of packages: ");

        for(int i=0; i<n; i++){
            packages[i] = sc.nextInt();
        }

        reverseArray(packages, 0, packages.length-1);

        for(int i=0; i<n; i++){
            System.out.print(packages[i] + " ");
        }
    }
}

