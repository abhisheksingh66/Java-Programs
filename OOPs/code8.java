class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;

    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name =n;

    }
}


public class code8 {
    public static void main(String[] args) {
        Employee abhi=new Employee();
        abhi.setName("abhsihek");
        // abhi.getName();
        System.out.println(abhi.getName());
    }
}

