public class code9 {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;
        int sum = 0;
        for (i = 1; i <= j; i++) { 
            if (i % 2 == 0) {
                sum += i;
                i++;
            }

        }
        System.out.print("Sum of Even Number is : " + sum);
    }
}
