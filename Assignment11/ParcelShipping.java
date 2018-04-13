import java.util.Scanner;
public class ParcelShipping{
    public static void main (String[] arg){
        Scanner scan = new Scanner(System.in);
        int height, width, depth, area, oversize=20, basic=5, overweight=10, weight;
        System.out.println("What is the height of the package?");
        height = scan.nextInt();
        System.out.println("What is the width of the package?");
        width = scan.nextInt();
        System.out.println("What is the depth of the package?");
        depth = scan.nextInt();
        System.out.println("What is the weight?");
        weight = scan.nextInt();
        area=(height*width*depth);
        if (area<5 && weight<5) {
            
            
            oversize = 0;
            overweight=0;
            
        } if (area>5){
            
            
            oversize = 20;
        }if (weight>5){
            
            
            
            overweight=10;
        }if (weight>5 && area>5){
            oversize = 20;
            overweight =10;
        }
        System.out.println("overweight charge: "+overweight);
        System.out.println("Oversize charge: "+oversize);
        System.out.println("Total: " +(overweight+oversize+basic));
    }
}