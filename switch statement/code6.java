import java.util.Scanner;

public class code6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Day !");
        String weak=input.next().toLowerCase();

        switch (weak) {
            case "monday" -> System.out.println("Basket Ball!");
            case "tuesday "-> System.out.println("Tennies !");
            case "wednesday" -> System.out.println("Basket Ball!");
            case "thursday" -> System.out.println("Cricket!");
            case "friday" -> System.out.println("Exercise!");
            case "saturday" -> System.out.println("Holiday !");
            default -> System.out.println("Invailid Data!");
           
        }
    }
}
