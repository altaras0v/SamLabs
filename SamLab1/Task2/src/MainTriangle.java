import java.util.Scanner;

/**
 * Program which count perimeter and square of triangle
 */
public class MainTriangle {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {

        try {
            Triangle triangle = new Triangle();
            /*
            Check that triangle is real
            */
            if(triangle.getSquare()==0){
                System.out.println("Такого треугольника не существует");
                System.exit(1);
            }
            System.out.printf("%s%.2f","Периметр треугольника:",triangle.getPerimeter());
            System.out.println();
            System.out.printf("%s%.2f","Площадь треугольника:",triangle.getSquare());
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректное значение");
        }
    }
}

