public class code13c {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        Circle c1 = new Circle(1.2);
        double dia = c1.diameter();
        double a1 = c1.area();
        double circum = c1.circumference();
        System.out.println("Radius : " + c1.radius);
        System.out.println("Diameter : " + dia);
        System.out.println("Area : " + a1);
        System.out.println("Circumference : " + circum);

    }
}
