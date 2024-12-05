import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        System.out.println("hello");
        
        // int age=10;
         
        // if (age>18) {
        //     System.out.println("Yes You Can drive");
        // }else{
        //     System.out.println("You Can't drive");
        // }


        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please Enter your age : ");
            int a=input.nextInt();
   

            if (a>20) {
                System.out.println("Yes You Can drive");
            }else{
                System.out.println("You Can't drive");
            }
        }
    }
}
