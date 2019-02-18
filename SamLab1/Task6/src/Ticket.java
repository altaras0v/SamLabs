import java.util.Scanner;

/**
 * Class which creates ticket and checks value of number of it
 */
public class Ticket {
    private int ticketNumber;
    private int firstPart, secondPart;

    /**
     * Constructor of ticket
     */
    public Ticket() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер трамвайного билета");
        this.ticketNumber = in.nextInt();
        if (this.ticketNumber / 100000 < 1 || this.ticketNumber / 100000 > 9) {
            System.out.println("Вы ввели некорректный номер");
            System.exit(1);
        }
    }

    /**
     * Count sum of first three number on the ticket
     * @return value of sum of three numbers
     */
    private int countFirstPart() {
        firstPart = ticketNumber / 100000 + ticketNumber / 10000 % 10 + ticketNumber / 1000 % 10;
        return firstPart;
    }
    /**
     * Count sum of last three number on the ticket
     * @return value of sum of three numbers
     */
    private int countSecondPart() {
        secondPart = ticketNumber / 100 % 10 + ticketNumber / 10 % 10 + ticketNumber % 10;
        return secondPart;
    }

    /**
     * Realization
     * Checks number of ticket for lucky number
     * @return string that means ticket lucky or not
     */
    private String ticketLuckyChecker() {
        if (countFirstPart() == countSecondPart()) {
            return "Ваш билет счастливый";
        } else {
            return "Ваш билет не явяляется счастливым";
        }
    }

    /**
     * Interface of ticketLuckyChecker()
     * @return result of ticketLuckyChecker()
     */
    public String checkLuckyTicket(){
       return ticketLuckyChecker();
    }
}