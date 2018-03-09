import java.util.Scanner;
class Microwave {
    public static void main (String[] args) {
         Scanner scan = new Scanner(System.in);
double HeatTime;
int NumberOfItems;
  System.out.println("Enter the numebr of items?");
  NumberOfItems = scan.nextInt();
  System.out.println("What is the recommended time to microwave your food?");
  HeatTime = scan.nextDouble();

if (NumberOfItems == 1) {
    HeatTime = HeatTime;
}
if (NumberOfItems == 2) {
    HeatTime = HeatTime * 1.5;
}
if(NumberOfItems == 3) {
    HeatTime = HeatTime * 2;
}
if (NumberOfItems > 3) {
    System.out.println("We recommend to not heat more than 3 items");
}
System.out.println("Heat your " + NumberOfItems + " item(s) for " + HeatTime);
}
}