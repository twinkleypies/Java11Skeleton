import java.util.Scanner;
public class ConcertTickets{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        double TicketPrice, AmountTickets, subtotal,GST, PST;
        
        System.out.println("how much are the tickets price?");
        TicketPrice = scan.nextDouble();
        System.out.println("How many are you ordering?");
        AmountTickets = scan.nextDouble();
        subtotal = TicketPrice * AmountTickets;
        System.out.println("For " + AmountTickets + " it would cost " + subtotal);
        GST = subtotal * 0.06;
        PST = subtotal * 0.07;
        System.out.println(" With 6% GST and 7% PST the total would come to " + (subtotal+(GST + PST)));
        //gives values for all of the variables and does math to compute the answer
    }
}
