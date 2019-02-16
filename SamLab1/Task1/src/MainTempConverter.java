import java.util.Scanner;

/**
 * Program which converts temperature
 */
public class MainTempConverter {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {
       try {
           System.out.println("Введите температуру в градусах Фаренгейта(°F):");
           Scanner in = new Scanner(System.in);

           double farenheitDegrees = in.nextDouble();

           TemperatureConverter temperature = new TemperatureConverter(farenheitDegrees);
           System.out.printf("Температура в градусах Цельсия равна: %.2f %s%n ", temperature.getCelsiusTemperature(), "°C");
       }
       catch (Exception e){
           System.out.println("Вы ввели некорректное значение!");
       }

    }
}
