import java.util.Scanner;
import java.text.*;

class FormattingAndNumericOutput{
 public static void main (String[] args){
     Scanner scan = new Scanner (System.in);
     DecimalFormat two = new DecimalFormat("###,###,##0.00");
     DecimalFormat One = new DecimalFormat("##0.###");
     DecimalFormat Three = new DecimalFormat("###, ###, 000.00");
     DecimalFormat Four = new DecimalFormat("-000, 000, 000.###");
     DecimalFormat Five = new DecimalFormat("$###, 000.00");
     System.out.println(One.format(102039));
     System.out.println(two.format(235891200.0235));
     System.out.println(Three.format(124254));
     System.out.println(Four.format(5.76));
     System.out.println(Five.format(13155));
     //new print lines with new dec formats
    }
}