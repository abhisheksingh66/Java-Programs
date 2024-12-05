class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Manager extends Employee {
    String department;

    Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

class Engineer extends Employee {
    String field;

    Engineer(String name, int id, String field) {
        super(name, id);
        this.field = field;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Field: " + field);
    }
}

public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, "HR");
        Engineer engineer = new Engineer("Charlie", 103, "Software Development");
        
        manager.displayInfo();
        engineer.displayInfo();
    }
}
