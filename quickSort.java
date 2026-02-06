import java.util.Scanner;

public class quickSort {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;

        for(int j = left; j < right; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, right);
        return i + 1;

        // int pivot = arr[right];
        // int pos = left;

        // for(int i=left; i<right; i++){
        //     if(arr[i] < pivot){
        //         int temp = arr[i];
        //         arr[i] = arr[pos];
        //         arr[pos] = temp;
        //         pos++;
        //     }
        // }
        // int temp = arr[pos+1];
        // arr[pos+1] = arr[right];
        // arr[right] = temp;
        // return pos+1;

    }

    public static void QuickSort(int[] arr, int left, int right){
        if(left > right){
            return;
        }
        int pi = partition(arr, left, right);

            QuickSort(arr, left, pi - 1);
            QuickSort(arr, pi + 1, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Before Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        QuickSort(arr, 0, n - 1);

        System.out.println("After Sorting:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
