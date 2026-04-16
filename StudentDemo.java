public class StudentDemo {

    int rollno;
    String name;

    StudentDemo(int rollno, String name) {

        this.rollno = rollno;
        this.name = name;
    }

    StudentDemo(Student s) {

        this.rollno = s.rollno;
        this.name = s.name;
    }

    void display(){
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        StudentDemo s1 = new StudentDemo(429, "Madhav");
        StudentDemo s2 = new StudentDemo(s1);
        
        s1.display();
        s2.display();
    }

    
    
}
