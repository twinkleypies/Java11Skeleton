import java.util.Scanner;
class TirePressure1{
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int RightFront;
            int LeftFront;
            int RightBack;
            int LeftBack;
            boolean Inflation;
            System.out.println("What is your right front tire pressure? ");
            RightFront = scan.nextInt();
            System.out.println("What is your left front tire pressure?");
            LeftFront = scan.nextInt();
            System.out.println("What is your right back tire pressure?");
            RightBack = scan.nextInt();
            System.out.println("What is your left back tire pressure?");
            LeftBack = scan.nextInt();
            
            if (RightFront == LeftFront && RightBack==LeftBack){
                System.out.println("Inflation is good");
            }


            else{
               System.out.println("Inflation is bad");
            }
            
}
}