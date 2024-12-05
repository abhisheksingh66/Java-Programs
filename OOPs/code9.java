class GraphPoint {
    double x_axis;
    double y_axis;
    public String direction;
    public double apptitude;
    public double longitute;

    void displayCoOrdinates() {
        System.out.println("(" + x_axis + "," + y_axis + ")");
    }
}

public class code9 {
    public static void main(String[] args) {
        System.out.println("Main Method Started !");

        GraphPoint p1 = new GraphPoint();
        p1.x_axis = 5.6;
        p1.y_axis = 6.7;
        p1.displayCoOrdinates();
        System.out.println("--------------------------------------");

        GraphPoint p2 = new GraphPoint();
        p2.x_axis = 2.3;
        p2.y_axis = 3.4;
        p2.displayCoOrdinates();

        System.out.println("Main Method Ended !");

    }
}
