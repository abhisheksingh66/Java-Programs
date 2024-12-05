import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        System.out.println("hello there");

        int i=5;
        System.out.println(i++);      
        // System.out.println(i);
        

        int j=7;
        System.out.println(++j);

        char a='a';
        System.out.println(a++);
        System.out.println(a);



    char b='c';
    System.out.println(++b);

     try (Scanner input = new Scanner(System.in)) {
        System.out.print("please enter your number : ");
         int a1=input.nextInt();
         System.out.println(a1>10);
    }


    }
}
