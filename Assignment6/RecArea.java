import java.util.Scanner;
class RecArea {

    public static void main(String[] args) {
        long Width;
        long Height;
        long Area;

        Scanner scan = new Scanner(System.in);
        long num, square;

        System.out.println("Enter an integer:");
        Width = scan.nextInt();
        System.out.println("Enter another integer:");
        Height = scan.nextInt();

        Area = Width * Height;

        System.out.println ( "The area of the square is " + Width * Height);
    }
}
