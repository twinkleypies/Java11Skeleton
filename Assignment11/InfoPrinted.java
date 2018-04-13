
import java.util.Scanner;
public class InfoPrinted{
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        String name, address, city, province, PostalCode;
        System.out.println("What's your name?");
        name = scan.nextLine();
        System.out.println("What's your address?");
        address = scan.nextLine();
        System.out.println("what city do you live in?");
        city = scan.nextLine();
        System.out.println("what province do you live in?");
        province = scan.nextLine();
        System.out.println("What is your postal code?");
        PostalCode = scan.nextLine();
        System.out.println("Name: " + name + " Address: " + address + " City: " +city+ " Province: " + province + " Postal code: " + PostalCode);
        //sets up all the variables, asks the name, address, city, province, and postal code and then spits it back out
    }
}