class Demo3 {
    int x = 10;
    int y = 20;

    void test() {
        System.out.println("Running test() method!");
    }
}

public class code3 {
    public static void main(String[] args) {
        Demo3 d1 = new Demo3();
        Demo3 d2 = new Demo3();
        System.out.println("Modifying x and y of d1 ");
        d1.x = 100;
        d1.y = 200;

        System.out.println("Printing x and y of d1");
        System.out.println("x value is " + d1.x);
        System.out.println("y values is " + d1.y);

        System.out.println("Printing x and y of d2");
        System.out.println("x value is " + d2.x);
        System.out.println("y values is " + d2.y);

        System.out.println("Main method Ended !");
    }
}
