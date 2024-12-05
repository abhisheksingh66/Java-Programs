public class code13 {
    public static void main(String[] args) {
        char ch = '$';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UPPERCASE");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("LOWERCASE");
        } else if (ch >= 0 && ch <= 9) {
            System.out.println("NUMBER");
        } else {
            System.out.println("SPECIAL CHARACTER");
        }
    }
}
