public class methodOverloadingExample {
    void add(){
        int a = 10;
        int b = 20;
        int c = a+b;
        System.out.println("add() : " + c);
    }

    void add(int a, int b){
        int c = a+b;
        System.out.println("add(int a, int b) : " + c);
    }
    
    void add(double a, double b){
        double c = a+b;
        System.out.println("add(double a, double b) : " + c);

    }

    public static void main(String[] args) {
        methodOverloadingExample e1 = new methodOverloadingExample();

        e1.add();
        e1.add(5.76, 6.34);
        e1.add(8, 5.25);
    }
}
