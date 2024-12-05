class WaterBotel {
    String brand;
    String type;
    double price;
    String capacity; 
void Bottle (){
    System.out.println("Your Water Botel Brand is : " +brand );
    System.out.println("Your Water Botel Type is : " +type );
    System.out.println("Your Water Botel Price is : " +price );
    System.out.println("Your Water Botel Capacity is : " +capacity );
}
    
}

public class code11 {
    public static void main(String[] args) {
        System.out.println("Main Method Started !");

        WaterBotel myBotel= new WaterBotel();
        myBotel.brand="Aqua";
        myBotel.type="Still Water";
        myBotel.price=150.18;
        myBotel.capacity= "1L";
        myBotel.Bottle();


        System.out.println("Main Method Ended !");


    }
}
