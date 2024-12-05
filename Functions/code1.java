public class code1 {

    public static void main(String[] args) {
        System.out.println("main method started !");
        findSquare(5);
        findSquare(6);
        findSquare(8);
        System.out.println("main method ended !");
    }

    public static void findSquare(int n) {
        // int n=5;
        int side = n * n;
        System.out.println("Square of " + n + " is : " + +side);
    }
}