import java.util.Scanner;
import java.util.Random;
class TestYourLuck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generaterandom = new Random();
        int num, guess, lucky, correct=0;
        //sets variables used in the program
        for (int i = 0; i<10; i++) {
            num = generaterandom.nextInt(100);
            System.out.println("guess if the number is between 1-50 or 51-100 Press 1 for 1-50 press 2 for 51-100");
            guess = scan.nextInt();
            
            if ((guess==1 && num<51)|| (guess ==2 && num>50)){
                correct++;
            }
            //counts the amount of guesses that are correct
        }
        if (correct>=6){
           System.out.println("Lucky");
          
        }
        else{
            System.out.println("Unlucky");
        }
        //prints out the result to see if they're lucky or not
    }
}