public class code6 {
    public static void main(String[] args) {
        System.out.println("Hello Java !");

        int p=12;
        int q=15;
        int r=p++ + q-- + p-- + q++;
        System.out.println(r);


        int i=14;
        int j=17;
        int k=i--+j++ +j--+i++;
        System.out.println(k);
    }
}
