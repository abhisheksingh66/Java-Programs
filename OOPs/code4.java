class Demo5 {
    int x = 10;
    int y = 20;

    void test() {
        System.out.println("Running test() method");
    }
}

public class code4 {
    public static void main(String[] args) {
        System.out.println("Main method Ended !");
        Demo5 d1 = new Demo5();
        Demo5 d2 = new Demo5();

        System.out.println("d1---------> " + d1);
        System.out.println("d2---------> " + d2);

        System.out.println("Modifying x and y through d1");
        d1.x = 100;
        d2.y = 200;
        System.out.println("Modifying x and y through d2");
        System.out.println(d2.x);
        System.out.println(d2.y);
    }
}
