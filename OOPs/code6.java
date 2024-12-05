class Pen {
    String brand;
    String color;
    double price;

}

public class code6 {
    public static void main(String[] args) {
        System.out.println("Main method Started !");

        Pen mypen = new Pen();
        mypen.brand = "Cello";
        mypen.color = "Black";
        mypen.price = 25.00;

        System.out.println("Brand of pen is : " + mypen.brand);
        System.out.println("Color of pen is : " + mypen.color);
        System.out.println("Price of pen is :" + mypen.price);

        System.out.println("Main method Ended !");
    }
}
