import java.util.Scanner;

/**
 * Class which build triangle and measure square and perimeter of it.
 */
public class Triangle {
    private double x1,x2,y1,y2,x3,y3;

    /**
     * Constructor of triangle
     */
    Triangle(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты вершин треугольника");
        System.out.println("Введите координату x1: ");
        this.x1 = in.nextDouble();
        System.out.println("Введите координату y1: ");
        this.y1 = in.nextDouble();
        System.out.println("Введите координату x2: ");
        this.x2 = in.nextDouble();
        System.out.println("Введите координату y2: ");
        this.y2 = in.nextDouble();
        System.out.println("Введите координату x3: ");
        this.x3 = in.nextDouble();
        System.out.println("Введите координату y3: ");
        this.y3 = in.nextDouble();
    }

    /**
     * Measure the length of first side of triangle
     * @return firstSide - value of first side
     */
    private double firstSide(){
        double firstSide = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return firstSide;
    }

    /**
     * Measure the length of second side of triangle
     * @return secondSide - value of second side
     */
    private double secondSide(){
        double secondSide = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        return secondSide;
    }

    /**
     * Measure the length of third side of triangle
     * @return thirdSide - value of second side
     * @return
     */
    private double thirdSide(){
        double thirdSide = Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));
        return thirdSide;
    }

    /**
     * Realization
     * Measure perimeter of triangle
     * @return perimeter - perimeter of triangle
     */
    private double measurePerimeter(){
        double perimeter = firstSide() + secondSide() + thirdSide();
        return perimeter;
    }
    /**
     * Realization
     * Measure square of triangle
     * @return square - square of triangle
     */
    private double measureSquare(){
        double square = Math.sqrt(measurePerimeter()/2 * (measurePerimeter()/2 - firstSide()) *
                (measurePerimeter()/2 - secondSide()) * (measurePerimeter()/2 - thirdSide()));
        return square;
    }

    /**
     * Interface of "measurePerimeter"
     * @return value of perimeter of triangle
     */
    public double getPerimeter(){
      return  measurePerimeter();
    }

    /**
     * Interface of " measureSquare"
     * @return value of square of triangle
     */
    public double getSquare(){
        return measureSquare();
    }
}