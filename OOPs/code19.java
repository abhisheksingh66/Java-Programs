import java.util.Scanner;

class CustomerAdd {
    String customerName;
    String Location;
    int addresNo;

    CustomerAdd(String val1, String val2, int val3) {
        customerName = val1;
        Location = val2;
        addresNo = val3;

    }

    void customerDetails(){
        System.out.println("");
        System.out.println("Customer Name : " + customerName + " and his Location is " + Location + addresNo);
    }
}

public class code19 {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String customerName;
        String Location;
        int addresNo;

        System.out.print("Enter Customer Name : ");
        customerName=input.next();

        System.out.print("Enter Customer Name : ");
        Location=input.next();
         
        System.out.print("Enter Customer Name : ");
        addresNo=input.nextInt();

        CustomerAdd customer1= new CustomerAdd(customerName, Location, addresNo);
        customer1.customerDetails();

     

    }
}
