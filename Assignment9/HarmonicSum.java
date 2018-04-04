import java.util.Scanner ;

public class HarmonicSum {

    public static void main (String args[]) {

        Scanner scan = new Scanner(System.in);

        int n, c;
        double total;

        total = 0;

        System.out.println("enter an integer?");

        n = scan.nextInt();

        c = 1;//you are going to count so start at zero

        //keep going while your counter is less than the number of times you want to print
        while (c <= n) {

            

            total = total + (1.0/c);

            c++;//this means add 1 to c you could do c=c+1; instead
        }

        System.out.println ( "The sum is " + total +".");
    }
}
