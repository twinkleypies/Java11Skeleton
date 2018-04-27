import java.util.Scanner;
import java.io.*;

class GetNumbersFromFile {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");
        Scanner scan = new Scanner(file);
        int age, IQ, gender, height;
        int totalPeople = 0;
        int tallSmrtGuy=0;
        int totalF=0;
        int totalM=0;
        int oldestAge;
        int totalIQ=0;
        int AverageIQ;
        int totalHeight=0;
        int averageHeight;
        while (scan.hasNextInt()) {
            age = scan.nextInt();
            if (age == -1) {
                break;
            }
            IQ = scan.nextInt();
            gender = scan.nextInt();
            height = scan.nextInt();
            totalPeople++;
            if (gender==0) {
                totalF+=1;
            }
            else if (gender==1){
                totalM+=1;
            }
            if (gender==1 && height>(12*6) && IQ>140) {
                tallSmrtGuy+=1;
            }
            totalIQ += IQ;
            totalHeight+=height;
            
            //keeps checking to see if there's another int and if the age is -1 it'll break
        }
        AverageIQ = totalIQ/totalPeople;
        averageHeight= totalHeight/totalPeople;
        scan.close();
    }
}