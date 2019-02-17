import java.util.Scanner;

/**
 * Class which counts value of deposit
 */
public class Deposit {
    private double startMoney;
    private double percent;
    private double resultMoney;
    private int month=0;

    /**
     * Constructor of Deposit
     */
    public Deposit(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите начальную сумму: ");
        this.startMoney = in.nextDouble();
        System.out.println("Введите процентную ставку: ");
        this.percent = in.nextDouble();
        if (this.percent<1||this.startMoney<=0){
            System.out.println("Вы ввели некорректное значение начальной суммы или процентной ставки.");
            System.exit(1);
        }
        this.resultMoney = this.startMoney;
    }

    /**
     * Increases value of money per month of percent that user entered
     * @return  increased value of money
     */
    private double moneyIncreasePerMonth(){
       resultMoney = resultMoney + (resultMoney * percent/100);
       return resultMoney;
   }

    /**
     * Realization
     * Increase value of money to 2 times
     * @return 2x value of money
     */
    private double doubleIncrease(){
        do {
            moneyIncreasePerMonth();
            month++;
        }while (resultMoney<(startMoney*2));
        return resultMoney;
   }

    /**
     * Getter of month
     * @return value of month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Interface of "doubleIncrease"
     * @return 2x value of money
     */
    public double getDoubleIncrease(){
        return  doubleIncrease();
    }
}
