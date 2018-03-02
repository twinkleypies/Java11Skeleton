import java.util.Scanner;

class AnnualApplianceCost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double AnnualUsedKWH;
        double PricePerKwh;
        
        System.out.println("Enter the appliance cost per kilowatt-hour in cents");
        PricePerKwh = sc.nextInt();
        System.out.println("Enter kilowatt-hours used per year");
        AnnualUsedKWH = sc.nextInt();
        System.out.println("The total annual cost is " + PricePerKwh * AnnualUsedKWH);
    }
}
        
        