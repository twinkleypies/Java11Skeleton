import java.util.Scanner;
import java.util.Random;
class RandomGuess {
 public static void main (String[] args) {
     Scanner scan = new Scanner(System.in);
     Random generateRandom = new Random();
     int num;
     int guess;
     
     num = generateRandom.nextInt(100);
     System.out.println("Guess a number");
     guess = scan.nextInt();
    
     System.out.println("You are " + (num-guess) + " away");
        //creates a number and tells you how far away u are
    }
}
