import java.util.Scanner;

class WordEcho {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count;

        String inputString;

        int times;

        System.out.println("Enter word:");

        inputString = scan.nextLine();

        times = inputString.length();

        count = 1;
        //get's the word

        while (count<=times) {
            System.out.println(inputString);
            count = count + 1;
            //repeats the word hwo many time the lettersit has
        }
    }
}