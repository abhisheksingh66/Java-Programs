import java.util.ArrayList;

public class Code2 {
    public static void main(String[] args) {
        System.out.println("Main Method !");

        ArrayList li = new ArrayList<>();
        System.out.println(li.isEmpty());

        System.out.println("ArrayList Size : " + li.size());
        System.out.println(li);

        System.out.println("Add Elements");
        li.add(1000);
        li.add(3.4);
        li.add("abhishek");
        li.add(true);
        li.add('j');
        li.add(66);
        li.add(null);

        System.out.println(li.isEmpty());
        System.out.println("ArrayList Size : " + li.size());
        System.out.println(li);

        System.out.println("Accessing Element 0 index 2");
        String str= (String)li.get(2);
        System.out.println(str.toUpperCase());

        System.out.println(" Remove Element 0 index 3");
        li.remove(3);
        System.out.println(li);

        System.out.println("Inserting Element 0 indexx 2");
        li.add(2,"demo");
        System.out.println(li);

        // System.out.println("Replace Element");
        // li.remove();
         

        System.out.println("Main MEthod Ended !");

    }
}
