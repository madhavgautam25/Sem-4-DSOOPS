public class Student {

    int rollno;
    String name;

    Student(int rollno, String name) {

        this.rollno = rollno;
        this.name = name;
    }

    Student(Student s) {

        this.rollno = s.rollno;
        this.name = s.name;
    }

    void display(){
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(429, "Madhav");
        Student s2 = new Student(s1);
        
        s1.display();
        s2.display();
    }

    
    
}
