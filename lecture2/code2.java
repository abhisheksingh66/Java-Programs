import java.util.Scanner;

public class code2 {
    public static void main(String[] args) {
        System.out.println("Calulate Your Percenteage % ");

        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your English Marks : ");
            float English=scan.nextFloat();

            System.out.print("Enter your Maths Marks : ");
            float Maths=scan.nextFloat();

            System.out.print("Enter your Physics Marks : ");
            float physics=scan.nextFloat();

            System.out.print("Enter your Chemistry Marks : ");
            float chemistry=scan.nextFloat();

            System.out.print("Enter your Computer Marks : ");
            float computer=scan.nextFloat();

            float percentage=((English + Maths + physics + chemistry + computer)/500)*10;
            System.out.print("your percentage is : " + percentage +"%");
        }
        

    }
}
