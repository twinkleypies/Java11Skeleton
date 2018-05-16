import java.util.Scanner;
class LibraryFine1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       while (true) {
           double finalVal=0;
           int DaysOverDue;
           char FineChar;
           
           System.out.println("How many days to overdue (enter 0 to exit)");
           DaysOverDue=scan.nextInt();
           scan.nextLine();;
           if (DaysOverDue == 0) {
             break;  
            }
            System.out.println("enter fine grade: ");
            String fineString = scan.nextLine();
            fineString = fineString.trim(); //takes out white spaces
            fineString = fineString.toUpperCase(); //converts string to uppercase
            FineChar = fineString.charAt(0); //collects first char of the string
            
           switch (FineChar) {
                case 'A':
                finalVal = 0.10;
                break;
                case 'B':
                finalVal = 0.25;
                break;
                case 'C':
                finalVal = 0.50;
                break;
                case 'D':
                finalVal = 1.00;
                break;
                case 'E':
                finalVal = 2.00;
                break;
                case 'F':
                finalVal = 5.00;
                break;
                default:
                System.out.println("Error.  Invalid char");
                //defines the amount of the fine depending on what the user chose
            }
             System.out.println("your fine is " + (finalVal * DaysOverDue));
        }
       
    }
}