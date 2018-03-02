import java.util.Scanner;
class PieEatingContest {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight;
        System.out.println ("How much do you weigh?");
        weight = scan.nextDouble();
        if (weight >= 220 && weight <= 280) {
            System.out.println("You can register for this contest");
        } else {
            System.out.println("Can't register for this event");
        }
    }
        
}
