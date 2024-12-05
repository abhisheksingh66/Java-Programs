package com.company;

interface Camera{
    void takePic();
    void recording();
}


interface Wifi{
    String[] getNetwork();
    void connectNet(String network);
}

class myPhone{

    void callNumber(int pnum){
        System.out.println("Calling " + pnum);
    };

    void callPick(){
        System.out.println("Connecting " );
    };



//    void takeSnap(){
//        System.out.println("Taking 'snap");
//    };

}

class SmartPhone2 extends myPhone implements Camera,Wifi{

    @Override
    public void takePic() {

    }

    @Override
    public void recording() {

    }

    @Override
    public String[] getNetwork() {
        return new String[0];
    }

    @Override
    public void connectNet(String network) {

    }
}


public class DefaultMethod {
    public static void main(String[] args) {

    }
}
