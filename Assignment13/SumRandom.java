import java.util.Scanner;
import java.util.Random;

class SumRandom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();
        int num, counter;

        for (counter = 1; counter <= 100; counter++) {
            num = generateRandom.nextInt(25) + 1;
            System.out.println(counter + " " + num);
        }

        System.out.print("Let's enter a number just for fun:");
        num = scan.nextInt();
        System.out.println("The number you entered was: " + num);

    }
}