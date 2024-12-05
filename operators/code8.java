public class code8 {
    public static void main(String[] args) {
        
      long principal = 100000;
      int tenure = 2; 
      double rateOfInterest = 11.5;

    //   Simple Interest = (P x T x R)/100 

    double simpleInterest = (principal*tenure*rateOfInterest)/100;
    System.out.println("The simple interest for a principal amount of " + principal +
                           " over " + tenure + " years at an interest rate of " + rateOfInterest +
                           "% is: " + simpleInterest);
                           
    // System.out.println(simpleInterest);

        


    }
}
