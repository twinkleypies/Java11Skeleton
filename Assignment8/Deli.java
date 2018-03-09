import java.util.Scanner;
class Deli {
    public static void main (String[] args) {
        String item;
       double price;
       int expressDelivery;
       double shippingcost=0.0;
       Scanner scan = new Scanner(System.in);
       System.out.println("What's your item?");
       item = scan.nextLine();
       System.out.println("What is the price?");
       price = scan.nextDouble();
       System.out.println("Do you want it to be delivered fast? enter 1 if you do enter 0 if you don't");
       expressDelivery = scan.nextInt();
       
       if (price<= 10.00){
           shippingcost += 2.00;
        }
       if (expressDelivery == 1) {
            shippingcost += 3.00;

            }
            System.out.println("Invoice:");
           System.out.println(item +" costs "+ price);
           System.out.println("Delivery costs " + shippingcost);
           System.out.println("Total is " + (price + shippingcost));
       
       
    
}
}
   