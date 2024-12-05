
// write a function which accepts price of product,the funtion should
//  find price to be paid after applying 18% gst



public class code2 {
    public static void main(String[] args) {
      product(222.8f);
      
    }

    static void product(double price) {
        double gstAmt=price*18;
        double total = price+gstAmt;

        System.out.println("Total  price of product is " + total);
    }
}
