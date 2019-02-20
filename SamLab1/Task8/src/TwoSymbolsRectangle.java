import java.util.Scanner;

/**
 * Class which creates rectangle consisting of two types elements
 */
public class TwoSymbolsRectangle {
    private int length;
    private int width;

    /**
     * Constructor of rectangle
     * User enters length and width of rectangle
     */
    TwoSymbolsRectangle(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника");
        this.length = in.nextInt();
        System.out.println("Введите ширину прямоугольника");
        this.width = in.nextInt();
    }

    /**
     *Displays symbols like a rectangle
     * "X" - outside, "0" - inside
     */
    public void displayRectangle(){
        for(int i = 1; i <= width; i++){
            if(i==1|| i==width) {
                for (int j = 1; j <= length; j++) {
                    System.out.printf("%s ","x");
                }
            }
            else {
                System.out.printf("%s ","x");
                for(int j = 2; j <= length-1; j++){
                    System.out.printf("%s ","0");
                }
                System.out.printf("%s ","x");
            }
            System.out.println();
        }
    }
}