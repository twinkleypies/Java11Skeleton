import java.util.Scanner;
class Question6{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name, animal, feature;


        System.out.println("Enter a name:");
        name = scan.nextLine();
        System.out.println("Enter an animal");
        animal = scan.nextLine();
        
        System.out.println("Enter a feature");
        feature = scan.nextLine();

        

        System.out.println ( name + " has a " + feature + " like a " + animal);
    }
}