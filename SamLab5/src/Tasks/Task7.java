package Tasks;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Random;

public class Task7 {
    public static void execute() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        Random random = new Random();
        int num = random.nextInt(5);

        switch (num) {
            case 1: {
                throw new NullPointerException();
            }
            case 2: {
                throw new ArithmeticException();
            }
            case 3: {
                throw new FileNotFoundException();
            }
            case 4: {
                throw new URISyntaxException("input", "reason");
            }
            default: {
                System.out.println("Исключение не было выброшенно");
                break;
            }
        }
    }
}
