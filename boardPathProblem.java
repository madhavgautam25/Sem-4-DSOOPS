import java.util.Scanner;

public class boardPathProblem {
    static void boardPath(int curr, int end, String res){
        if(curr == end){
            System.out.println(res);
            return;
        }
        if(curr > end) return;

        for(int i=1; i<=6; i++){
            boardPath(curr+i, end, res+i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the end position : ");
        int end = sc.nextInt();

        boardPath(0, end, "");
    }
}
