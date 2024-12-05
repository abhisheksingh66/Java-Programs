public class code10 {
    public static void main(String[] args) {
        int a = 14;
        int b = 14;
        int c = ++a + --b + ++a + --b;
        System.out.println(c);

        int x = 17;
        int y = 14;
        int z = ++x + --y + ++x + --y;
        System.out.println(z);

        int p = 10;
        int q = 14;
        int r = ++p + --q + --p + ++q;
        System.out.println(r);

        int i = 16;
        int j = 18;
        int k = --i + ++j + ++i + --j;
        System.out.println(k);
    }
}
