public class Permutation {

    static void permute(String str, String res) {

        if (str.length() == 0) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String rem = str.substring(0, i) + str.substring(i + 1);

            permute(rem, res + ch);
        }
    }

    public static void main(String[] args) {
        permute("abc", "");
    }
}
