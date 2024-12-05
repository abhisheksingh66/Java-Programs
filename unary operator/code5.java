public class code5 {
    public static void main(String[] args) {
        System.out.println("HELLO JVAA !");
        // problem-1
        int a = 11;
        int b = 14;
        int c = a++ + b-- + a++ + b--;
        System.out.println(c);

        // problem-2
        int x = 17;
        int y = 15;
        int z = x-- + y++ + x-- + y++;
        System.out.println(z);
    }
}
