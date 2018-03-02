import java.util.Scanner;
class Question4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long TicketPrice;
        long Tickets;

        System.out.println("How many tickets are you buying?:");
        Tickets = scan.nextInt();
        System.out.println("How much are these tickets?");
        TicketPrice = scan.nextInt();

        

        System.out.println ( "The price for " + Tickets + " tickets is $" + Tickets * TicketPrice);
    }
}