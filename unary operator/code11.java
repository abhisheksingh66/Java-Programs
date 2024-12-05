public class code11 {
    public static void main(String[] args) {
        int a=13;

        int b=15;
        int c= a++ + --b + --a + b++;
        System.out.println(c);


        int x=11;
        int y=14;
        int z= ++x + y-- + x-- + ++y;
        System.out.println(z);



        int p=16;
        int q= 19;
        int r=++q + --p + --q + ++p;
        System.out.println(r);

        int i=23;
        int j=21;
        int k =i++ + --j+ ++i +j--;
        System.out.println(k);
    }
}
