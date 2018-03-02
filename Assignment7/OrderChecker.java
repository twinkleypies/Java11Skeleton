import java.util.Scanner;
class OrderChecker {
    public static void main (String[] args) {
       Scanner scan = new Scanner( System.in );
       
      final double BoltPrice = 0.05;
      final double NutPrice = 0.03;
      final double WasherPrice = 0.01;
       double amountBolts, amountNuts, amountWashers;
       
       System.out.println("how many nuts have you bought?");
      amountNuts = scan.nextDouble();
      System.out.println("how many bolts have you bought?");
      amountBolts = scan.nextDouble();
      System.out.println("how many washers have you bought?");
      amountWashers = scan.nextDouble();
      double finalPrice = BoltPrice * amountBolts + NutPrice * amountNuts + WasherPrice * amountWashers;
      
      
          if (amountBolts > amountNuts || amountBolts > (amountWashers * 2)) 
         { 
             if (amountBolts > (amountWashers * 2 )) {
                 System.out.println ("Check the order: too few washers");
                }
                if (amountBolts > amountNuts) {
                System.out.println("CHeck the order: too few nuts");
            }
                    
          
         
        }else  {
            System.out.println ("Order is OK");
      }
      System.out.println ("total cost is " + finalPrice );
    }
}