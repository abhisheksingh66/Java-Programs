class Circle {
    double radius;

    Circle(double val1) {
        System.out.println("Creating Circle of Radius : " + val1);
        radius = val1;

    }

    double diameter() {
        return 2 * radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double circumference() {
        return 2 * 3.14 * radius;
    }

}

public class code13 {
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
