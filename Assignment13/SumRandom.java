import java.util.Scanner;
import java.util.Random;

class SumRandom {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generateRandom = new Random();
        int num, sum=0;
        //sets the variables and sets up random generater and scanner

        for (int i = 0; i <= 10; i++) {
            num = generateRandom.nextInt(25) + 1;
            sum += num;
            System.out.println(i + " " + num);
            //gets the sum of numbers makes the loop so it can generate numbers up to 25
        }

        System.out.println("the sum is " + sum);
        //gives the total

    }
}