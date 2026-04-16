import java.util.Scanner;

public class WarehouseUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            if(i == n-1){
                System.out.println(arr[i]);
                break;
            }
            if ((arr[i]^arr[i+1]) == 0){
                i = i+2;
            }else{
                System.out.println(arr[i]);
                break;
            }
        }

        
    }
}
