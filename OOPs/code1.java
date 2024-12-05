class Demo1 {
    int x = 10;
    int y = 20;

    void test() {

    }
}

public class code1 {
    public static void main(String[] args) {
        System.out.println("Main method Started !");

        Demo1 d1 = new Demo1();
        System.out.println(d1.x);
        System.out.println(d1.y);
        d1.test();

        System.out.println("Main method Ended !");
    }
}