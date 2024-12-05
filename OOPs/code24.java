class Display{

//   int a=20;

  Display(){

    System.out.println("constructor !");
  }

  static void disp1(){
    System.out.println(" Static func");
  }

  void disp2(){
    System.out.println(" non Static func");
  }
}

public class code24 {
    public static void main(String[] args) {
        System.out.println("Main Method Stareted !");

        Display val1=new Display();
        val1.disp1();
        
    }
}
