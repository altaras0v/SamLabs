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
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите координаты вершин треугольника");
            System.out.println("Введите координату x1: ");
            double x1 = in.nextDouble();
            System.out.println("Введите координату y1: ");
            double y1 = in.nextDouble();
            System.out.println("Введите координату x2: ");
            double x2 = in.nextDouble();
            System.out.println("Введите координату y2: ");
            double y2 = in.nextDouble();
            System.out.println("Введите координату x3: ");
            double x3 = in.nextDouble();
            System.out.println("Введите координату y3: ");
            double y3 = in.nextDouble();

            Triangle triangle = new Triangle(x1, y1, x2, y2, x3, y3);
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

