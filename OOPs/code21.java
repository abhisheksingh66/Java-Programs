import java.util.Scanner;

class AtmCard{
    
    String cardName;
    int cardNo;

    AtmCard(String val1, int val2){
        cardName=val1;
        cardNo=val2;

    }

    void cardDetails(){
        System.out.println("Your ATMCARD Name is " +cardName + "and Card Number : " + cardNo);
    }

}


public class code21 {
    public static void main(String[] args) {
        System.out.println("Wlecome !");

        String cardName;
        int cardNo;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your carname:");
        cardName=input.next();

        System.out.print("Enter card number : ");
        cardNo=input.nextInt();

        AtmCard card1=new AtmCard(cardName, cardNo);
        card1.cardDetails();
        
    }
}
