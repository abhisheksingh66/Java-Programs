class Student {
    int id;
    String name;
    double marks;

    Student(int val1, String val2, double val3) {
        id = val1;
        name = val2;
        marks = val3;

    }
}

public class code12 {
    public static void main(String[] args) {

        System.out.println("Miain method started !");

        Student stud1 = new Student(101, "Abhishek", 50.00);

        System.out.println("The Id of student is : " + stud1.id);
        System.out.println("The name of student is : " + stud1.name);
        System.out.println("The Marks of student is : " + stud1.marks);

        System.out.println("Main method Ended !");

    }
}
