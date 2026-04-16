
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);

        list.addAll(list2);

        System.out.println(list);

        list.remove(2);
        System.out.println("After remove(index): " + list);

        list.remove(Integer.valueOf(25));
        System.out.println("After remove(object): " + list);

        System.out.println("Size of list: " + list.size());

        System.out.println("Contains 30?: " + list.contains(30));

        System.out.println("Index of 60: " + list.indexOf(60));

        System.out.println("Get element at index 3: " + list.get(0));

        list.set(2, 100);

        System.out.println("After set index 2 to 100: " + list);
    }
}
