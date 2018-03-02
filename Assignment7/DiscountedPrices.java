import java.util.Scanner;
class DiscountedPrices {
    public static void main (String[] args) {
       Scanner scan = new Scanner( System.in );
       
       double price;
       double discount;
       double total;
       
       System.out.print("how much is your purchase?");
      price = scan.nextDouble();
      discount = 0.9;
      
       if ( price>10 ){ 
           total = price * discount;
       System.out.println("the total price of your purchase is $" + total);
       
    }else { 
       System.out.println ("the total price of your purchase is $" + price);
    
    }
       
       
    }
}