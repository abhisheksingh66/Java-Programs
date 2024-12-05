import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Product {
    private static final AtomicInteger count = new AtomicInteger(0); // Atomic integer for unique ID generation
    private final int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.id = count.incrementAndGet(); // Auto-generate unique ID
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + "\nName: " + name + "\nPrice: " + price + "\nQuantity: " + quantity;
    }
}

public class ProductManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product name: ");
        String name = scanner.nextLine();

        System.out.println("Enter the product price: ");
        double price = scanner.nextDouble();

        System.out.println("Enter the product quantity: ");
        int quantity = scanner.nextInt();

        // Create a new product with the input values
        Product product = new Product(name, price, quantity);

        // Print product details
        System.out.println("\nProduct created successfully:");
        System.out.println(product);
    }
}

