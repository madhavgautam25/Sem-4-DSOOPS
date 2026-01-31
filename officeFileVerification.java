import java.util.Scanner;

public class officeFileVerification {
    static boolean  checkEmployeeIDs(int[] emp_id, int index){
        
        if(index == emp_id.length - 1){
            return true;
        }
        if(emp_id[index] > emp_id[index + 1]){
            return false;
        }

        return checkEmployeeIDs(emp_id, index+1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] emp_id = new int[n];

        for(int i=0; i<n; i++){
            emp_id[i] = sc.nextInt();
        }


        if(checkEmployeeIDs(emp_id,0)){
            System.out.println("Employee IDs are sorted");
        }else{
            System.out.println("Employee IDs are not sorted");
        }
    }
}
