package Tasks;

import java.io.*;

public class Task5 {
    public static void Task5() {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\test.txt")))
        {
            //чтение построчно
            String s;
            while((s=br.readLine())!=null){
                System.out.println(s);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
