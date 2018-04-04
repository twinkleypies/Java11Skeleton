import java.util.Scanner;

class mpg {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        double initialmiles, finalmiles, gallons;

        System.out.print("Enter initial miles: ");

        initialmiles = scan.nextDouble();
        // sets the varibles and looks for the intial miles
        //keep going while initialmiles is NOT negative 1
        while (!(initialmiles == -1)) {

            System.out.print("Enter Final Miles: ");

            finalmiles = scan.nextDouble();

            System.out.print("Enter gallons: ");

            gallons = scan.nextDouble();

            System.out.println("Miles per Gallon: "+( finalmiles-initialmiles )/gallons);

            System.out.println();

            System.out.print("Enter initial miles (-1 to exit): ");

            initialmiles = scan.nextDouble();
            //this gathers the info on final miles, gallons, and initial mile until the intial mile is not negative 1

        }
        
        System.out.println("Bye");
    }
}