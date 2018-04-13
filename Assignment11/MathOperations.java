import java.util.Scanner;
public class MathOperations{
    public static void main (String args[]){
        Scanner scan = new Scanner (System.in);
        double n, n2;
        System.out.println("Choose a number");
        n = scan.nextDouble();
        System.out.println("Choose another number");
        n2 = scan.nextDouble();
        System.out.println(n+n2);
        System.out.println(n*n2);
        System.out.println(n/n2);
        //gives variables for 2 different numbers, asks for two numbers, and then prints the answer of the two numbers being added multiplied and divided
    }
}

