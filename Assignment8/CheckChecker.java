import java.util.Scanner;
class CheckChecker{
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            double ServiceCharge;
            int CheckAccount;
            int SavingAccount;
            String name;
            System.out.println("How much is in your checkings account?");
            CheckAccount = scan.nextInt();
            System.out.println("How much is in your savings account");
            SavingAccount = scan.nextInt();
            
            if (SavingAccount >= 1500 || CheckAccount >=1000){
                ServiceCharge= 0;
            }


            else{
                ServiceCharge = 0.15;
            }
            System.out.println("You will pay $" + ServiceCharge + " per check");
}
}
