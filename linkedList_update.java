
import java.util.LinkedList;

public class linkedList_update {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add(1, "For");
        list.addFirst("Orange");
        list.addLast("Grapes");

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println();

        for(String str : list){
            System.out.println(str + " ");
        }
    }
}
