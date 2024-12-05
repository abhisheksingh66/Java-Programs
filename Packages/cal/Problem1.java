package cal;



 class CalC {
    public void calci(int a, int b){
        System.out.println("Your result is : " + a+b);
    }
}


class ScCalC {
    public void calci(int a, int b){
        System.out.println("Your result is : " + Math.sin(a+b));
    }
}

class HyCalC {
    public void calci(int a, int b){
        System.out.println("Your result is : " + a+b);
        System.out.println("Your result is : " + Math.sin(a+b));
    }
}

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Main Method !");
    }
}
