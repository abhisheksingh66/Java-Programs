public class code15 {
    public static void main(String[] args) {
        double bal = 10000.0;

        int amnt = 130;

        if (amnt <= bal) {
            if (amnt % 100 == 0) {
                System.out.println("Withdrawal Successs !");
                // System.out.println("");
            } else {
                System.out.println("Not Success !");
            }
        } else {
            System.out.println("Insufficient Balance !");
        }
    }
}
