import java.util.Scanner;
class Question5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long TotalEggs;
        long DozenEggs;
       
        DozenEggs = 12;
        

        System.out.println("How many Eggs are there?:");
        TotalEggs = scan.nextInt();
        // % is remainder
        System.out.println (" There are " + TotalEggs / DozenEggs + " dozen and a remainder of " + TotalEggs % DozenEggs);
    }
}
