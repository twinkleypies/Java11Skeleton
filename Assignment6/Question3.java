import java.util.Scanner;
class Question3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long Age;
        long Year;
        long Month;

        System.out.println("How old are you?:");
        Age = scan.nextInt();

        Year = 365;
        Month = 12;

        System.out.println ( "You're " + Age * Year + " days old and " + Age * Month + " months old and " + Age + " years old");
    }
}