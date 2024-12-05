class Demo2 {
    int x = 10;
    int y = 20;

    void test() {
        System.out.println("Running test() method!");
    }
}

public class code2 {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        System.out.println("d1----------> " + d1);

        Demo2 d2 = new Demo2();
        System.out.println("d2--------> " + d2);

        System.out.println("Main method Ended !");
    }
}
