import java.util.LinkedList;
public class linkedList_two {
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add(2, "5");

        System.out.println(list);
    }
}
