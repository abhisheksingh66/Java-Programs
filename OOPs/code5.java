class Demo4{
    int x=25;
    int y=30;
}


public class code5 {
    public static void main(String[] args) {
        Demo4 d1= new Demo4();
        d1.x=50;
        d1.y=60;
        
        d1 =new Demo4();
        System.out.println(d1.x);
        System.out.println(d1.y);

    }
}
