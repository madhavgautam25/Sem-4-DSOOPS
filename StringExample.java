class Student{
    int rollno;
    String name;

    void display(){
        System.out.println("Roll number: " + rollno);
        System.out.println("Name: " + name);
    }
}
public class StringExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 25;
        s1.name = "Manu";

        s1.display();
    }
}
