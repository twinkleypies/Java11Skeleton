import java.util.Scanner;
class BrickDrop {
    public static void main (String[] args) {
        
       double d, t;
       double g = 32.174;
       System.out.println("how many seconds did it take to fall?");
       Scanner scan = new Scanner(System.in);
       t = scan.nextDouble();
       
       System.out.println("the distance it fell is " + ((1.0/2.0)*g*t*t) + "ft the time it took to fall is " + t +"s");
       
    }
}
        