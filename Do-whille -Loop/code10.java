public class code10 {
    public static void main(String[] args) {
        int num = 28;
        int i = 1;
        int sum=0;
        while (i <= num / 2) {
            if (num % i == 0) {
                // System.out.println(i);
                 sum+=i;
                }
                i++;
        }
        System.out.println("sum is : " +sum);
    }
}
