import java.util.Scanner;
class TimesTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                System.out.println("enter times table");
        int tableChoice = scan.nextInt();
        scan.nextLine();
        int CorrectAnswers =0;
        for (int i = 1; i <= tableChoice; i++) {
        System.out.println(tableChoice + " x " + i + " = ");
        int UserInput = scan.nextInt();
        //does the math and scans user's input
        if (UserInput == (i * tableChoice)) {
            
            System.out.println("Correct");
            CorrectAnswers++;
            //counts amount of times they're correct
        }
        else {
            System.out.println("Wrong.  Correct answer is: " + (i * tableChoice));
        }
    }
    System.out.println("You got " + CorrectAnswers + " out of " + tableChoice);
    //prints how many times the person is correct
    }
}
