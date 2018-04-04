import java.util.Scanner;
public class ShippingCalc{
    
    public static void main (String args[]) {
        Scanner scan = new Scanner (System.in);
        double weight;
        double ShipCost=3;
        System.out.println("What is the weight of your order?");
        weight = scan.nextInt();
        //defines the variables and starts the loop
        while (!(weight==0)){

        ShipCost=3;
            
        if (weight>10){
                ShipCost+= (0.25 * (weight - 10));
            }

            
            System.out.println("Weight of order: " + weight);
           System.out.println("Shipping cost; " + ShipCost);
           
        System.out.println("What is the weight of your order?");
        weight = scan.nextInt();
        //makes a loop continuesly asking the weight of the order until the weight of the order is 0
       
        }
   
        
    }
    
}