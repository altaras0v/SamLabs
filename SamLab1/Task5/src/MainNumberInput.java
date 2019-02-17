import java.util.Scanner;

/**
 * Program which counts amount of numbers that user entered, counts sum of it and average
 * Code in Main class cause program is very small.
 */
public class MainNumberInput {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {
        try {
            System.out.println("Введите число с клавиатуры. \nКак только вы введёте 0 будет произведён рассчёт");
            Scanner in = new Scanner(System.in);
            double sum = 0;
            int count = 0; // int count = -1; if don't need to include 0 to average and count
            double number;
            do {
                number = in.nextDouble();
                sum += number;
                count++;
            } while (number != 0);
            System.out.printf("%s %d %s %.2f %s %.2f", "Было введено чисел:", count, "\nИх сумма равна:", sum,
                    "\nИх среднее арифметическое равно:", sum / count);
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректное значение!");
        }
    }
}
