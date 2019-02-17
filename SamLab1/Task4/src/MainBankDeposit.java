/**
 * Program which counts bank deposit
 * User start enters value of money and value of percent
 */
public class MainBankDeposit {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {
        try {
            Deposit deposit = new Deposit();
            System.out.printf("%s %.2f %s %d %s", "Ваш депозит удвоится и будет равен", deposit.getDoubleIncrease(),
                    "через", deposit.getMonth(), "месяцев");
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректное значения");
        }
    }
}
