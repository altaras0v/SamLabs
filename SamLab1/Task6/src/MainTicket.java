/**
 * Program which checks lucky number on the ticket
 */
public class MainTicket {
    /**
     * Entry point of program
     * @param args the command line arguments.Arguments aren't passed
     */
    public static void main(String[] args) {
        try {
            Ticket ticket = new Ticket();
            System.out.println(ticket.checkLuckyTicket());
        }
        catch (Exception e){
            System.out.println("Вы ввели некорректное значение");
        }
    }
}
