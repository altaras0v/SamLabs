/**
 * Program which show number that user entered like a text
 */
public class MainNumberConverter {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {

        try {
            NumberConverter number = new NumberConverter();
            System.out.printf("%s %s","Вы ввели число:",number.getNumber());
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректное значение");
        }
    }
}
