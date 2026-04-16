
import java.util.ArrayList;

public class ArrayListExample {
    
    public static void main(String[] args) {
        ArrayList arrlist = new ArrayList<>();

        arrlist.add(10);
        arrlist.add(20);
        if(arrlist.contains(10)){
            System.out.println(true);
        }
        System.out.println(arrlist);
    }
}
