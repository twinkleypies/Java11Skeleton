import java.util.Scanner;
public class CreditCardBill{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        double MonthlyPay, Balance=1000.00,Interest;
        int Month=1;
        System.out.println("Enter the monthly payment");
        MonthlyPay = scan.nextDouble();
        //defines all variables and gives monthly pay a value
        while(!(Balance <=0)){

            System.out.println("Month: " + Month);
            System.out.println(" Balance: " + (Balance-MonthlyPay));
            System.out.println(" Total Payments: " + (MonthlyPay*Month));
            Month++;
            Balance-=MonthlyPay;
            Balance=Balance*1.015;
            //prints the month, balance and total payment with the math in a loop until the balance is less or equal to 0
        }
        
    }
}