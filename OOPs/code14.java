
class TicketCounter {
    int counterNumber;
    int no_of_tickets;

    TicketCounter(int val1, int val2) {
        counterNumber = val1;
        no_of_tickets = val2;
        // int a=66;
        // System.out.println(a);
    }

    void viewAvlTickets() {
        System.out.println("Total Tickets : " + no_of_tickets);
      
    }

    void buyTickets(int n) {
        System.out.println("Buying " + n + " Tickets");
        if (n < no_of_tickets) {
            no_of_tickets -= n;
            System.out.println("Buying Tickets Success !");

        } else {
            System.out.println("Buying Tickets Failed , due to insufficient Tickets");
        }

    }

    void cancelTickets(int n) {
        System.out.println("Cancelling " + n + " tickets");
        no_of_tickets += n;
    }

}

public class code14 {
    public static void main(String[] args) {

        System.out.println("Main Method Started !");

        TicketCounter tc1 = new TicketCounter(105, 50);
        tc1.viewAvlTickets();
        tc1.buyTickets(20);
        tc1.buyTickets(15);
        tc1.cancelTickets(10);
        tc1.viewAvlTickets();

        System.out.println("Main Method Ended !");

    }
}
