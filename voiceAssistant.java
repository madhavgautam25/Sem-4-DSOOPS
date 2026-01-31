import java.util.Scanner;

public class voiceAssistant {
    static int countVowels(String str){
        if(str.length() == 0) return 0;

        char first = str.charAt(0);
        int ans = countVowels(str.substring(1));

        if("AEIOUaeiou".contains(first + "")){
            return ans+1;
        }else {
            return ans;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        System.out.println("Total vowels are: " + countVowels(str));
    }
}
