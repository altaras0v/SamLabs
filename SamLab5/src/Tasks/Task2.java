package Tasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task2 {
    public static void Task2(){
        try {
            FileInputStream fis = null;
            fis = new FileInputStream("C:\\test.txt");
            fis.read();
        }catch (FileNotFoundException e){
            System.out.println("FileInputStream e");
        }
        catch (IOException e){
            System.out.println("IOException e");
        }
        System.out.println("132");
    }
}

