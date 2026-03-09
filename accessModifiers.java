public class accessModifiers {
    private int x;
    public int y;

    public accessModifiers(int x) {
        this.x = x;
    }

    void show(){
        System.out.println("Example of private modifier");
        System.out.println("variable is accessed inside same class: " + x);
    }
    public static void main(String[] args) {
        accessModifiers a1 = new accessModifiers(10);
        a1.show();
    }
}
class sample{
    void display(){
        // System.out.println("Outside class: " + x);  // NOT ALLOWED IN DIFFERENT CLASS
    }
}
