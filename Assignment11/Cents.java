import java.util.Scanner;
public class Cents{
    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);
        int cents;
        System.out.println("How many cents do you have?");
        cents = scan.nextInt();
        System.out.println("You have " + cents + " but you have $" + (cents/100) + " dollars " + (cents%100)+ " cents");
        //collects the amount of cents the person has and it prints out the total number of cents and then converts it into dollars

    }
}