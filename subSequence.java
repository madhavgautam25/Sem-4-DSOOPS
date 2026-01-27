import java.util.Scanner;
public class subSequence {
    static void subseq(String str, String res){
        // System.out.println("CALL str = " + str + " res = " + res);
        if(str.length()==0){
            System.out.println(res);
            return;
        }
        char ch = str.charAt(0);
        String rem = str.substring(1);

        subseq(rem, res + ch);

        subseq(rem, res);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to find subsequence : ");
        String str = sc.nextLine();
        subseq(str,"");
    }
}
