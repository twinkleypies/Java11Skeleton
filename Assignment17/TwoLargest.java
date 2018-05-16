import java.io.*;

class TwoLargest {

  public static void main(String[] args) throws IOException {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables for the two largest
    int evenSum = 0;
    int oddSum = 0;
    int totalSum = 0;
    
    
    // compute the two largest
    for (int index= 0; index < data.length; index++) {
        if (data[index] % 2 ==0){
            evenSum+= data[index];
        }else{
                oddSum += data[index];
            }
        }
        totalSum = oddSum + evenSum;
    }
      
    // write out the two largest
    System.out.println("e: " + evenSum + " 0: " +oddSum + " t: " + totalSum);

  }
}