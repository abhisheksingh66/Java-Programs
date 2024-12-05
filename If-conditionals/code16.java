public class code16 {
    public static void main(String[] args) {
        char gen = 'M';
        int age = 23;

        if (gen == 'M') {

            if (age >= 21) {
                System.out.println("Eligible age");
            } else {
                System.out.println("boy underage ");
            }
        } else if (gen == 'F') {

            if (age >= 18) {
                System.out.println("Eligible Spinster");
            } else {
                System.out.println("select statement");
            }

        }
    }
}
