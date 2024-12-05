public class Vehicle {
    private String type;
    private String brand;
    private int year;

    // No-argument constructor
    public Vehicle() {
        this.type = "Unknown";
        this.brand = "Unknown";
        this.year = 0;
    }

    // Constructor with one parameter
    public Vehicle(String type) {
        this.type = type;
        this.brand = "Unknown";
        this.year = 0;
    }

    // Constructor with two parameters
    public Vehicle(String type, String brand) {
        this.type = type;
        this.brand = brand;
        this.year = 0;
    }

    
    public Vehicle(String type, String brand, int year) {
        this.type = type;
        this.brand = brand;
        this.year = year;
    }


    public void display() {
        System.out.println("Type: " + type + ", Brand: " + brand + ", Year: " + year);
    }
    
    public static void main(String[] args) {
        
        
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle("Car");
        Vehicle v3 = new Vehicle("Bike", "Yamaha");
        Vehicle v4 = new Vehicle("Truck", "Ford", 2022);
        v1.display();  
        v2.display();  
        v3.display();  
        v4.display();  
    }
}
