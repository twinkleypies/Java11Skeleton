import java.util.Scanner;
class FantasyGame{
        public static void main (String[] args) {
            Scanner scan = new Scanner(System.in);
            int Strength;
            int Health;
            int Luck;
            String name;
            System.out.println("What's your name?");
            name = scan.nextLine();
            System.out.println("What's your strength? (1-10)");
            Strength = scan.nextInt();
            System.out.println("What's your Health? (1-10)");
            Health = scan.nextInt();
            System.out.println("What's your luck? (1-10)");
            Luck = scan.nextInt();
            
            if (Strength+ Health + Luck > 15){
                System.out.println(name +" your character stats have been assigned to the default because it cannot succeed a total of 15 points");
                Luck = 5;
                Health = 5;
                Strength = 5;
                
            }
            System.out.println(name + "your strength is " + Strength + " your health is " + Health + " your luck is " + Luck);
        }
}
