import java.util.Scanner;
class LastChanceGas {
    public static void main (String[] args) {
        int FuelCapacity, CurrentFuelPercent, MilesPerGallon;
        Scanner scan = new Scanner(System.in);
        System.out.println("what's your tank capacity?");
        FuelCapacity = scan.nextInt();
        System.out.println("what's your gage reading? ");
        CurrentFuelPercent = scan.nextInt();
        System.out.println("what's your miles per gallon?");
        MilesPerGallon = scan.nextInt();
        int AvailableDistance = (CurrentFuelPercent / 100) * FuelCapacity;
        if (AvailableDistance < 200) 
        {
         System.out.println ("Get Gas!");
    }
        else System.out.println("Safe to drive");
    }
        
}

