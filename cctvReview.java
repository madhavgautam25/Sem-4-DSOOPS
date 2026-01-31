import java.util.Scanner;

public class cctvReview {
    static int findAppearance(int[] footage, int index, int frame){
        if(index == footage.length) return -1;

        int ans = findAppearance(footage, index+1, frame);

        if(ans != -1) return ans;

        if(footage[index] == frame) return index;

        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] frame_id = new int[n];

        System.out.print("Enter the frame numbers: ");

        for(int i=0; i<n; i++){
            frame_id[i] = sc.nextInt();
        }

        System.out.print("Enter the frame number for which you have to find latest appearance: ");
        int frame = sc.nextInt();

        System.out.println("Latest Appearance (Index from last) is: " + findAppearance(frame_id, 0, frame));
    }
}
