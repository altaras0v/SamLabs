/**
 * Class which build triangle and measure square and perimeter of it.
 */
public class Triangle {
    private double x1,x2,y1,y2,x3,y3;

    /**
     * Constructor of triangle
     * @param x1 Point x1 that user entered
     * @param y1 Point x2 that user entered
     * @param x2 Point y1 that user entered
     * @param y2 Point y2 that user entered
     * @param x3 Point x3 that user entered
     * @param y3 Point y3 that user entered
     */
    Triangle(double x1,double y1,double x2,double y2,double x3,double y3){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
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