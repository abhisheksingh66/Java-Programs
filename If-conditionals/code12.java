public class code12 {
    public static void main(String[] args) {
        int age = 16;

        if (age <= 3) {
            System.out.println("Your Ticket is Free !");

        } else if (age >= 4 && age <= 10) {
            System.out.println("HALF TICKET !");

        } else if (age >= 14 && age < 60) {
            System.out.println("You have to pay full charge  of Ticket !");
        } else {
            System.out.println("Special !");
        }
        ;
    }
}
