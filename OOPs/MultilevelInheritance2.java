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

class Director extends Manager {
    String region;

    Director(String name, int id, String department, String region) {
        super(name, id, department);
        this.region = region;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Region: " + region);
    }
}

public class MultilevelInheritance2 {
    public static void main(String[] args) {
        Director director = new Director("Bob", 102, "Finance", "North America");
        director.displayInfo();
    }
}
