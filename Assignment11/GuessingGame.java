import java.util.Scanner;
public class GuessingGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int guess;
        int guesses=0;
        int number = (int)Math.random()* 10 +1;
        //gets a random number from 1-10
        while (guesses<3) {
            System.out.println("Guess a number between 1-10");
             guess = scan.nextInt();
            if (guess == number) {
                System.out.println("YAY! You must be a mind reader");
                break;
                //stops the loop if they get it right
            }else{
                System.out.println("Nah, you're wrong...");
                guesses++;
            }
            //gives 3 guessin' chances and gives the response if you're right or wrong
        }
        System.out.println("Game over. Good try. Valiant effort.");
        //ends the game :(
    }
}