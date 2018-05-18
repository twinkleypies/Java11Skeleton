import java.io.*;

class ThreeSums {

    public static void main(String[] args) throws IOException {
        int[] data = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };

        // declare and initialize three sums
        int evenSum=0;
        int oddSum = 0;
        int totalSum=0;
        

        // compute the sums
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 ==0){
                evenSum += data[i];
            } else {
                oddSum += data[i];
            }
            //adds all the odd variables together and all the even variables together
            
        }
        totalSum = evenSum + oddSum;

        // write out the three sums
        System.out.println("odd sum: " + oddSum + " even sum: " + evenSum+ "total: " +totalSum);

    }
}