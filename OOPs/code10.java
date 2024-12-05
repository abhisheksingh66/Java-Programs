class GPSLocation {
    double longitute;
    double apptitude;
    String direction;

    void displayCoOrdinates() {
        System.out.println("(" + longitute + "," + apptitude + " ," + direction + ")");
    }
}

public class code10 {
    public static void main(String[] args) {
        System.out.println("Main Method Started !");

        GPSLocation p1 = new GPSLocation();
        p1.longitute = 5.6;
        p1.apptitude = 6.7;
        p1.direction = "Right";
        p1.displayCoOrdinates();
        System.out.println("--------------------------------------");

        GPSLocation p2 = new GPSLocation();
        p2.longitute = 2.3;
        p2.apptitude = 3.4;
        p2.direction = "Left";
        p2.displayCoOrdinates();

        System.out.println("Main Method Ended !");

    }
}
