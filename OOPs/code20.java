import java.util.Scanner;

class FoodItems {
    String FoodName;
    int FoodItemNo;

    FoodItems(String val1, int val2) {
        FoodName = val1;
        FoodItemNo = val2;
    }

    void detais() {
        System.out
                .println("Your Food order is "  + FoodName + " and Your oder Number is : " + FoodItemNo);

        System.out.println("Your Oder is being prepared");
    }

}

public class code20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welecome ! Please Oder your Food ");

        String FoodName;
        int FoodItemNo;

        System.out.print("Enter Your Food Name : ");
        FoodName = input.next();

        System.out.print("Enter Customer Name : ");
        FoodItemNo = input.nextInt();

        FoodItems item1 = new FoodItems(FoodName, FoodItemNo);
        item1.detais();

    }
}
