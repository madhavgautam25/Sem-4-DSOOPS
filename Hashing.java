import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Map <Integer,String> map = new HashMap<>();

        int hashcode = map.hashCode();

        int index = hashcode & (16-1);
        System.out.println(index);

        map.put(1, "madhav");
        map.put(2, "manu");
        map.put(3, "vaibhav");
        map.put(4, "jatin");
        System.out.println("Original map: " + map);
        map.put(4, "medhansh");
        System.out.println("After updating key 4: " + map);

        System.out.println("Size of map: " + map.size());

        if(map.containsKey(5)){
            System.out.println("key is present");
        }else{
            System.out.println("key is not present");
        }
    }
}
