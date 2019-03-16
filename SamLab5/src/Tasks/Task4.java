    package Tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4 {
    public static void Task4() {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader("C:\\test.txt"));
            //чтение построчно
            String s;
            while ((s = br.readLine()) != null) {

                System.out.println(s);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
