import java.util.Scanner;

public class ShapeAreaCalaculator {
    double area(double radius){
        return Math.PI * radius * radius;
    }

    double area(double length, double breadth){
        return length * breadth;
    }

    double area(double a, double b, double c){
        double s = (a+b+c)/2;

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape: ");
        String shape = sc.nextLine();

        if(shape)

    }
}
