import java.util.*;

class Student {
    String name;
    int id;
    int marks;

    Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;

    }

    public String toString(){
        return "Name: " + name + " ID: " + id + " Marks: " + marks;
    }
}
public class StudentManagementSystem {
    public static void main(String[] args) {
        
        List <Student> Students = new ArrayList<>();
        Students.add(new Student("Madhav", 1, 88));
        Students.add(new Student("Manu", 2, 82));
        Students.add(new Student("Vaibhav", 3, 90));
        Students.add(new Student("Medhansh", 4, 94));
        Students.add(new Student("Jatin", 5, 80));
        Students.add(new Student("Rahul", 6, 30));
        Students.add(new Student("Jaggu", 7, 35));

        for(Student s : Students){
            System.out.println(s);
        }

        Student topStudent = Students.get(0);
        for(Student s : Students){
            if(s.marks > topStudent.marks){
                topStudent = s;
            }
        }
        System.out.println("Top Student's Highest Marks: " + topStudent);

        Iterator <Student> itr = Students.iterator();
        while(itr.hasNext()){
            Student s = itr.next();
            if(s.marks < 40){
                itr.remove();
            }
        }
        // for(Student s : Students){
        //     if(s.marks < 40){
        //         Students.remove(s);
        //     }
        // }
        System.out.println("After removing the students scored less than 40 marks: ");
        System.out.println(Students);

        int searchId = 4;
        for(Student s : Students){
            if(s.id == searchId){
                s.marks = 95;
            }
        }

        Collections.sort(Students,(s1,s2) -> s1.marks - s2.marks);
        System.out.println("Students sorted by marks: ");
        for(Student s : Students){
            System.out.println(s);
        }

        int count = 0;
        for(Student s : Students){
            if(s.marks > 80){
                count++;
            }
        }
        System.out.println("Students scored above 80 marks: " + count);

        System.out.println("Final Students List: ");
        for(Student s : Students){
            System.out.println(s);
        }

    }
}
