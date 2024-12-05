public class code14 {
    public static void main(String[] args) {
        int a = 15;

        if (a % 2 == 0) {
            if (a < 10) {
                System.out.println("Biryani");
            }

            else {
                System.out.println("veg");
            }
        } else {
            if (a < 10) {
                System.out.println("vegan");
            } else {
                System.out.println("pizza");
            }
        }
    }
}
