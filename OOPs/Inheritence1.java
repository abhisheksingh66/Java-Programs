class Vehicle {
   
    String brand;
    int year;
    
    
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
    
    
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}


class Car extends Vehicle {
   
    int numberOfDoors;
    
    
    Car(String brand, int year, int numberOfDoors) {
        super(brand, year); 
        this.numberOfDoors = numberOfDoors;
    }
    
    
    
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

public class Inheritence1 {
    public static void main(String[] args) {
    
        Car car = new Car("Toyota", 2022, 4);
        Car car2 = new Car("Swift", 2023, 4);
        
        car.displayInfo();
        car2.displayInfo();
    }
}
