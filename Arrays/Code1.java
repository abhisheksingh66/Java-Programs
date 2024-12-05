import java.util.ArrayList;

public class Code1 {
    public static void main(String[] args) {

        System.out.println("Main Method");

        ArrayList li = new ArrayList();
        li.add(100);
        li.add("test");
        li.add(122);
        li.add("Demo");
        li.add("Sample");
        li.add(32);
        li.add("run");

        int intCount = 0;
        int stringCount = 0;

        for (int i = 0; i < li.size(); i++) {

            Object Element = li.get(i);

            if (Element instanceof String) {
                stringCount++;

            } else if (Element instanceof Integer) {
                intCount++;

            }
        }

    }

}