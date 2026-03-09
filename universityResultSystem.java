public class universityResultSystem {
    int rollno;
    int marks[];
    String name;

    int totalMarks(int marks[], int rollno, int i){
        if(i == marks.length) return 0;

        return marks[i] + totalMarks(marks, rollno, i+1);
    }

    public static void main(String[] args) {
        universityResultSystem s1 = new universityResultSystem();
        s1.marks = new int[] {80, 85, 70, 95, 88};
        System.out.println(s1.totalMarks(s1.marks, 2, 0));
    
        // universityResultSystem s2 = new universityResultSystem();
    }

}
