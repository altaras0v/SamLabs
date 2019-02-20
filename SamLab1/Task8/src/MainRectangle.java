/**
 * Program which shows rectangle on the screen
 * Rectangle consist of two types elements
 * Inside - one type, outside - other type
 * User enters length and width of rectangle
 */
public class MainRectangle {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {

        try {
            TwoSymbolsRectangle rectangle = new TwoSymbolsRectangle();
            rectangle.displayRectangle();
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректные значения");
        }
    }
}