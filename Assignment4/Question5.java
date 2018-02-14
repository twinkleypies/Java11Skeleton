public class Question5 {
    public static void main(String[] args) {
            double price = 1.47;
            double quantity = 25;
            double total = 0;
        for (int i = 0; i < quantity; i++) {
            total += price;

            System.out.println ("$" + total);

        }
 
    }
}