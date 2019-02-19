/**
 * Program which displays triangle matrix on the screen
 * User entered 2 values and these values are basis for the matrix
 */
public class MainMatrix {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {
        try {
            TriangleMatrix triangleMatrix = new TriangleMatrix();
            triangleMatrix.displayMatrix();
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректное значение");
        }
    }
}
