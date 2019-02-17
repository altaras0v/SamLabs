import java.util.Scanner;

/**
 *Class that initialize number that user entered and divide it into parts
 */
public class NumberInitializer {
    private  int number;

    /**
     * Constructor that create number thar user entered
     */
   public NumberInitializer(){
           Scanner in = new Scanner(System.in);
           System.out.println("Введите трехзначное число ");
           this.number = in.nextInt();
       }

    /**
     * Realization
     * Find third figure of number
     * @return third figure
     */
    private int thirdNumberFinder(){
        int thirdNumber = this.number%10;
        return thirdNumber;
    }
    /**
     * Realization
     * Find second figure of number
     * @return second figure
     */
    private int secondNumberFinder(){
        int secondNumber = this.number%100/10;
        return secondNumber;
    }
    /**
     * Realization
     * Find first figure of number
     * @return first figure
     */
    private int firstNumberFinder(){
        int firstNumber = this.number/100;
        return firstNumber;
    }
    /**
     * Realization
     * Find first two figure of number
     * @return first two figure
     */
    private int doublePartFinder(){
        int doublePart = this.number%100;
        return doublePart;
    }
    /**
     * Interface of "firstNumberFinder"
     * @return first figure of number
     */
    public int getFirstNumber(){
        return firstNumberFinder();
    }
    /**
     * Interface of "secondNumberFinder"
     * @return second figure of number
     */
    public int getSecondNumber(){
        return secondNumberFinder();
    }
    /**
     * Interface of "thirdNumberFinder"
     * @return third figure of number
     */
    public  int getThirdNumber(){
        return thirdNumberFinder();
    }
    /**
     * Interface of "doubleNumberFinder"
     * @return first two figure of number
     */
    public int getDoublePart(){
        return doublePartFinder();
    }
}
