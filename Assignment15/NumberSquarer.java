import java.util.Scanner;
class NumberSquarer {
    public static void main(String[] args) {
        int num=1;
        Scanner scan = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Choose a number. (enter 0 to end it)");
            num = scan.nextInt();
            System.out.println(num + "^2 = " + num * num);
        }
        System.out.println("Bye");
        //collects the int and then does it to the power of 2 then done
    }
}