import java.util.Scanner;
public class RectangleArea{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        while (true) {
        int x, x2, y, y2, width, height, area;
        System.out.println("Enter first x coordinate");
        x = scan.nextInt();
        System.out.println("Enter first y coordiante");
        y = scan.nextInt();
        System.out.println("Enter second x coordiante");
        x2 = scan.nextInt();
        System.out.println("Enter second y coordinate");
        y2 = scan.nextInt();
        //sets the variables and finds what they are
        if (x > x2){
            width = x -x2;
            
        }
        else if (x<x2){
            width = x2-x;
        } else{
            System.out.println("That ain't no rectangle");
            break;
        }
        if (y> y2){
            height = y - y2;
        } else if (y<y2){
            height = y2-y;
        }
        else {
            System.out.println("That ain't no rectangle");
            break;
        }//finds the variable for legnth and height and makes sure if the math doesn't match up the loop will stop 
        System.out.println("width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + width*height);
        //prints out what the area width and the height of the rectangle
    }
    }
}