public class code11 {
    public static void main(String[] args) {
        
        int val = 12;
        if (val % 2 == 0 && val % 3 == 0) {
            System.out.println("BANGALORE !");
        } else if (val % 2 == 0) {
            System.out.println("CHENNAI !");
        } else if (val % 3 == 0) {
            System.out.println("HYDERABAD !");
        } else {
            System.out.println("MYSORE !");
        }
    }
}
