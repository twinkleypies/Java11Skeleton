import java.util.Scanner;
public class DrugPotency{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int month=0;
        double effective;
        System.out.println("how effective is the drug?");
        effective = scan.nextDouble();
        //gets the current effectiveness of the drug and declairs the variables
        while (!(effective<=50)){
            effective = effective-(effective*0.04);
            System.out.println("month " + month);
            month++;
            System.out.println("effectiveness: " +effective);
            //does the math to find out how many months it'll take until its not effective anymore
        }
    }
    
}