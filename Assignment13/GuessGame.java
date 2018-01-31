import java.util.Scanner;
import java.util.Random;

class GuessGame {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//hello
        Random generateRandom = new Random();
        int num, guess;
        num = generateRandom.nextInt(100) + 1;

        do { //putting a do here instead of the while guarantee’s that the loop will execute at least once…with a while you have to make sure the conditions will cause the loop to happen at least once.

            System.out.print("Guess the number: ");
            guess = scan.nextInt();

            if (guess > num)
                System.out.println("Too High");

            if (guess < num)
                System.out.println("Too Low");

        }

        while (num != guess);//this means while num is not equal to guess.. by putting the while here it evaluates after you have guessed
        System.out.println("You got it");
    }
}