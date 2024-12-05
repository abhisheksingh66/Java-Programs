import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Your Day !");
        int num=input.nextInt();

        switch (num) {
            case 1 -> System.out.println("January!");
            case 2 -> System.out.println("February!");
            case 3 -> System.out.println("March !");
            case 7 -> System.out.println("April!");
            case 8 -> System.out.println("February!");
            case 9 -> System.out.println("March !");
            case 10 -> System.out.println("January!");
            case 11 -> System.out.println("February!");
            case 12 -> System.out.println("March !");
            case 13 -> System.out.println("January!");
            case 14 -> System.out.println("February!");
            case 15 -> System.out.println("March !");
            default -> System.out.println("INVALID LANGAUAGE !");
        }
    }
}

