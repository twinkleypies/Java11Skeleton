import java.util.Scanner;
class TirePressure2{
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int RightFront;
            int LeftFront;
            int RightBack;
            int LeftBack;
            boolean Inflation = true;

            System.out.println("What is your right front tire pressure? ");
            RightFront = scan.nextInt();
            if (RightFront < 35 || RightFront>45){
                System.out.println("Warning: Pressure is out of range.");
                Inflation = false;
            }

            System.out.println("What is your left front tire pressure?");
            LeftFront = scan.nextInt();
            if (LeftFront < 35 || LeftFront>45){
                System.out.println("Warning: Pressure is out of range.");
                Inflation = false;
            }
            System.out.println("What is your right back tire pressure?");
            RightBack = scan.nextInt();
            if (RightBack < 35 || RightBack>45){
                System.out.println("Warning: Pressure is out of range.");
                Inflation = false;
            }
            System.out.println("What is your left back tire pressure?");
            LeftBack = scan.nextInt();
            if (LeftBack < 35 || LeftBack>45){
                System.out.println("Warning: Pressure is out of range.");
                Inflation = false;
            }

            if (RightFront == LeftFront && RightBack==LeftBack){
                System.out.println("Inflation is good");
            }


            else{
               System.out.println("You have poor inflation");
            }                                    if (!Inflation){
                System.out.println("your tire pressure isn't in range");
            }
            

}
}