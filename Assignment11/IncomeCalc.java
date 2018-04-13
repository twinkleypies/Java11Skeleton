import java.util.Scanner;
public class IncomeCalc{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        double HourPay, GrossPay, TaxR, HWorked, GrossIncome,tax=1.30;
        System.out.println("How much money do you earn per hour?");
        HourPay = scan.nextDouble();
        System.out.println("How many hours have you worked?");
        HWorked = scan.nextDouble();
        GrossIncome = HourPay*HWorked;
        //does math and set the variables and gives them values
        System.out.println("Your gross pay is " + GrossIncome + "tax is " + (GrossIncome*0.3)+" with your 30% tax it's " + (GrossIncome*tax));
        //prints out all the info about the pay
    }
}