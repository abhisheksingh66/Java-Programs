import java.util.Scanner;

class Student {

    int id;
    String name;
    String email;

    Student(int val1, String val2, String val3) {
        this.id = val1;
        this.name = val2;
        this.email = val3;
    }

    void details() {
        System.out.println("Student Id : " + id + "\nStudent Name : " + name + "\nStudent Email : " + email);
    }
}

public class code17c {
    public static void main(String[] args) {
        System.out.println("Main Method Started !");

        Scanner input = new Scanner(System.in);

        int stId;
        String sName;
        String sEmail;

        System.out.print("Enter Student Id : ");
        stId = input.nextInt();

        System.out.print("Enter Student Name : ");
        sName = input.nextLine();

        System.out.print("Enter Student Email : ");
        sEmail = input.nextLine();

        Student st1 = new Student(stId, sName, sEmail);
        st1.details();

        System.out.println("Main Method Ended !");
    }
}
