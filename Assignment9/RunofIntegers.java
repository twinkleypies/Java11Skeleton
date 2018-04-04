import java.util.Scanner;

class RunofIntegers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count, limit;
        System.out.println("enter start number:");

        count = scan.nextInt();
        System.out.println("Enter limit value:");
        limit = scan.nextInt();
        //this defines what number to start counting at and end at
        while (count<=limit) {
            System.out.println("count is: " +count);
            count = count + 1;
            //this defines how much it counts by
        }
        System.out.println("Done with the loop");
    }
}