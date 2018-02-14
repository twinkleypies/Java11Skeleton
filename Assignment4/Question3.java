public class Question3 {
    public static void main(String[] args) {
        double ticketPrice = 23.45;
        double quantity = 8;
        double total = 0;
        double tax = ticketPrice * quantity * 0.12;
        total = ticketPrice * quantity + tax;

        System.out.println("Tax price is " + tax + "dollars ");
        System.out.println("The total price is " + ticketPrice * quantity * 1.12 + "dollars ");
    }
}