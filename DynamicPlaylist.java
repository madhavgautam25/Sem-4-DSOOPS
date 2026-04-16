import java.util.*;

public class DynamicPlaylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();

        while (sc.hasNext()) {
            String operation = sc.next();

            if (operation.equals("ADD")) {
                String song = sc.next();
                playlist.add(song);
            } 
            else if (operation.equals("REMOVE")) {
                int index = sc.nextInt();
                if (index >= 0 && index < playlist.size()) {
                    playlist.remove(index);
                }
            } 
            else if (operation.equals("PLAY")) {
                int index = sc.nextInt();
                if (index >= 0 && index < playlist.size()) {
                    System.out.println(playlist.get(index));
                }
            }
        }
    }
}
    

