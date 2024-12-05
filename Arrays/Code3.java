import java.util.ArrayList;

class Student {

    private int rollno;
    private String name;
    private double marks;
    private char grade;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
  
    public Student(int rollno, String name, double marks, char grade) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.grade = grade;

    };

}

public class Code3 {
    public static void main(String[] args) {

        System.out.println("Main Metrhod");
        Student s1 = new Student(101, " Bheem", 78, 'A');
        Student s2 = new Student(102, " Chutki", 55, 'B');
        Student s3 = new Student(103, " Indu", 66, 'C');
        Student s4 = new Student(101, "Kalia ", 45, 'D');
        Student s5 = new Student(101, " Raju", 69, 'C');

        ArrayList List = new ArrayList();
        List.add(s1);
        List.add(s2);
        List.add(s3);
        List.add(s4);
        List.add(s5);

        System.out.println("Total Students : " + List.size());
        System.out.println(List);

        System.out.println("........................");
        System.out.println("Rollno\tName\tMarks\tgender");
        System.out.println("........................");

        for (int i = 0; i < List.size(); i++) {
            Student s = (Student) List.get(i);
            System.out.println(s.getRollno() + "\t" + s.getName() + "\t" + s.getMarks() + "\t" + s.getGrade() + "\t");

        }
        System.out.println("........................");
        System.out.println("Updating Student Record Marks");

        for (int i = 0; i < List.size(); i++) {
            Student s = (Student) List.get(i);
            if (s.getRollno() == 101) {
                s.setMarks(79.80);

            }
            System.out.println(s.getRollno() + "\t" + s.getName() + "\t" + s.getMarks() + "\t" + s.getGrade() + "\t");

        }

    }
}
