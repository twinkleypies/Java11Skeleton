import java.util.Scanner;

class InrangeAdder {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        int high, low, InSum=0, OutSum=0, input;
        System.out.println("Enter Low End of Range: ");
        low = scan.nextInt();
        System.out.println("Enter High end of Range: ");
        high = scan.nextInt();
            System.out.println("Enter Data");
            input = scan.nextInt();
        //this gives all the variables and gives the high and low varibale a number
        while (!(input == 0)) {

            if (input<=high && input>=low){
                InSum += input;
            }
            else {
                OutSum += input;
            }
            System.out.println("Enter Data");
            input = scan.nextInt();
            //this gathers the data and adds seperate Out Sum and InSum values
        }
        System.out.println("The sum of in range values is: " + InSum);
        System.out.println("The sum of the out range values is: " + OutSum);
        //prints the final total of the sums
        
    }
}