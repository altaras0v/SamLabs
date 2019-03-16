package Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task3 {
    public static void Task3() {
        try {
            FileInputStream fis = null;
            fis = new FileInputStream("C:\\test.txt");
            fis.read();
        } catch (IOException e) {
            System.out.println("Exception e");
        }
        System.out.println("132");
    }
}

