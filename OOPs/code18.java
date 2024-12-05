import java.util.Scanner;

class Mobile{
    String brand;
    String name;
    String color;
    double price;

    Mobile(String val1, String val2,String val3, double val4){
        brand =val1;
        name =val2;
        color =val3;
        price=val4;

    }

    void mobDetails(){

        System.out.println(" Phoone Brand is " + this.brand + "Name : " + this.name + "Mobile color : " +this.color + "\nPrice : " + price);
    }
}

public class code18 {
    public static void main(String[] args) {
        System.out.println("Main Method Strated !");

        Scanner input =new Scanner(System.in);
        String Mbrand;
        String Mname;
        String Mcolor;
        double Mprice;

        System.out.print("Your Mobile brand is : ");
        Mbrand =input.next();
 
        System.out.print("Your Mobile Name  is : ");
        Mname =input.next();

        System.out.print("Your Mobile Color is : ");
        Mcolor =input.next();

        System.out.print("Your Mobile Price is : ");
        Mprice =input.nextDouble();


        Mobile myPhone=new Mobile(Mbrand, Mname, Mcolor, Mprice);
        myPhone.mobDetails();



        System.out.println("Main Method Ended !");

    }
}
