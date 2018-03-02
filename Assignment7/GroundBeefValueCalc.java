import java.util.Scanner;
class GroundBeefvalueCalc{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double APricePerPound;
        double APercentLean;
        double BPricePerPound;
        double BPercentLean;
        
        
        
        System.out.println("What's the price per pound for package A");
        APricePerPound = scan.nextDouble();
        System.out.println("What's the price per pound for package B");
        BPricePerPound = scan.nextDouble();
        System.out.println("What is the lean percetage in package A");
        APercentLean = scan.nextDouble();
        System.out.println("What is the lean percetage in package B");
        BPercentLean = scan.nextDouble();
        System.out.println("Price per pound package A: " + APricePerPound);
        System.out.println("Percent lean package A: " + APercentLean);
        System.out.println("Price per pound package B: " + BPricePerPound);
        System.out.println("Percent lean package B: " + BPercentLean);
        double BPriceLean = (100/BPercentLean)*BPricePerPound;
        double APriceLean = (100/APercentLean)*APricePerPound;
        System.out.println("Package A costs per pound of lean: " + APriceLean);
        System.out.println("Package B costs per pound of lean: " + BPriceLean);
        if (APriceLean > BPriceLean) {
            System.out.println("Package B is better");
        } else {
            System.out.println("Package A is better");
        }
}
}