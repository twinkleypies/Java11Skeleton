import java.util.Scanner;
class NameEchoAlt {
    public static void main (String[] args) {
        String inData;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name:");
        inData = scan.nextLine();
        System.out.print("Hello, " + inData);
        //It doesn't print on another line it just prints the response right beside the question
    }
}