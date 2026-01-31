import java.util.Scanner;

public class lastDocumentSearch{
    static int linearSearch(int[] doc_id, int key, int index){
        if(index == doc_id.length-1){
            return -1;
        }
        if(doc_id[index] == key){
            return index;
        }

        return linearSearch(doc_id, key, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] doc_id = new int[n];

        System.out.print("Enter the document numbers: ");

        for(int i=0; i<n; i++){
            doc_id[i] = sc.nextInt();
        }

        System.out.print("Enter the document number for which you have to find index: ");
        int key = sc.nextInt();

        System.out.println("Index is: " + linearSearch(doc_id, key, 0));
    }
}