package com.company;

class Employee{
   private int id;
   private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}



public class Necomp {
    public static void main(String[] args) {
     Employee e1=new Employee();
    e1.setId(111);
    e1.setName("abhishek");
//    e1.getId();
//    e1.getName();
        System.out.println( e1.getId());
        System.out.println( e1.getName());
    }
}
