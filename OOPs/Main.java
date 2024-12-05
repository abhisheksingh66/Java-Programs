class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    
    void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

  
    void displayInfo() {
        super.displayInfo();
        System.out.println("Grade: " + grade);
    }
}

class PartTimeStudent extends Student {
    int workingHours;

    PartTimeStudent(String name, int age, String grade, int workingHours) {
        super(name, age, grade);
        this.workingHours = workingHours;
    }
   
    void displayInfo() {
        super.displayInfo();
        System.out.println("Working Hours: " + workingHours);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Abhishek", 40, "Mathematics");
        Student student = new Student("John Doe", 16, "10th Grade");
        PartTimeStudent partTimeStudent = new PartTimeStudent("Jenny", 20, "2nd Year", 20);

        teacher.displayInfo();
        System.out.println();
        student.displayInfo();
        System.out.println();
        partTimeStudent.displayInfo();
    }
}
