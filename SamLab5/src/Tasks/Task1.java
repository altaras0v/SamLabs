package Tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void Task1() throws NullPointerException {

        String[] mas = new String[5];
        mas[0] = "123";
        mas[1] = "12";
        mas[2] = "1";
        mas[4] = "123";


        for (String s : mas) {
            try {
                System.out.println(s.hashCode());
            } catch (NullPointerException e) {
                continue;
            }

        }
    }
}
