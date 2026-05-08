import java.util.*;
public class WordExist {

    public static boolean wordExist(String s, List<String> dict) {
        if (s.isEmpty()) {
            return true;
        }
        for (int i = 1; i <= s.length(); i++) {
            String rem = s.substring(0, i);
            if (dict.contains(rem) && wordExist(s.substring(i), dict)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> dict = new ArrayList<>();
        dict.add("Chitkara");
        dict.add("University");
        String s = "ChitkaraUniversity";
        boolean result = wordExist(s, dict);
        System.out.println(result);
    }
}
