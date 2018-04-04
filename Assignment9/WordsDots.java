import java.util.Scanner;

class WordsDots {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count;

        String firstword;
        String secondword;

        int times;

        System.out.println("Enter word:");

        firstword = scan.nextLine();
        
        System.out.println("enter word");
        secondword = scan.nextLine();
        times = 30 - firstword.length() - secondword.length();

        count = 0;
        System.out.print(firstword);
        // gets the first words and set the equation to determin the number of dots

        while (count<=times) {
            System.out.print(".");
            count = count + 1;
            //prints the correct amount of dots to make sure there are 30 characters total
        }
        System.out.print( secondword);
        
        
        
    }
}