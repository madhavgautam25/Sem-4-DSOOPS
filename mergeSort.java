public class mergeSort {
    static void MergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left+right)/2;

            MergeSort(arr, left, mid);
            MergeSort(arr, mid+1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[l+i];
        }
        for(int i=0; i<n2; i++){
            right[i] = arr[m+i+1];
        }

        int i=0, j=0, k=l;

        while(i<n1 && j<n2){
            if(left[i] >= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }

        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {24,7,35,15,9,12};
        int n = arr.length;
        MergeSort(arr, 0, n-1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
