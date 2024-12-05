import java.io.File;
import java.io.FileWriter;

public class NewFile {
    public static void main(String[] args) {


        try {
            FileWriter yourfile=new FileWriter("apple.txt");
            yourfile.write("hello java !");
            yourfile.close();
        }catch (Exception e){
            System.out.println("Something went wrong " + e);
        }
    }
}
