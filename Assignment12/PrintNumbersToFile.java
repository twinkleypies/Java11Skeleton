import java.util.Scanner;
import java.io.*;

class PrintNumbersToFile {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int age=0, IQ, gender, height;
        File file = new File("data.txt");
        PrintStream print = new PrintStream(file);
        //sets the variables and gets the print stream working to put the variables in the file
        while (age != -1) {
            System.out.println("age(-1 to exit): ");
           age = scan.nextInt();
           if (age == -1){
               break;
            }
           System.out.println("IQ:");
           IQ = scan.nextInt();
           System.out.println("1 for male 0 for female");
           gender = scan.nextInt();
           System.out.println("Height:");
           height = scan.nextInt();
            print.println(age);
            print.println(IQ);
            print.println(gender);
            print.println(height);
            //gives values of the variables into the file, and asks in a continuous loop until age = -1 then it breaks the loop
        }

        print.close();
    }
}