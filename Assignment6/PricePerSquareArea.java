import java.util.Scanner;
class PricePerSquareArea{

    public static void main(String[] args) {
        long Width;
        long Height;
        long Area;
        long PaintPrice;
        long Price;

        Scanner scan = new Scanner(System.in);
        long num, square;

        System.out.println("Enter an integer:");
        Width = scan.nextInt();
        System.out.println("Enter another integer:");
        Height = scan.nextInt();
        System.out.println("What's the price for paint per square area?:");
        PaintPrice = scan.nextInt();

        Area = Width * Height;
        Price = Area * PaintPrice;

        System.out.println ( "The price for paint per square area is " + Area * PaintPrice);
    }
}