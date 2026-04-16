import java.util.*;

public class OnlineStore {
    public static void main(String[] args) {
        Map <String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of orders: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            String ord = sc.next();
            // map.put(ord, map.getOrDefault(ord, 0)+1);
            if(map.containsKey(ord)){
                map.put(ord, map.get(ord)+1);
            }else{
                map.put(ord, 1);
            }
        }
        System.out.println("Frequency of orders: " + map);
    }
}
