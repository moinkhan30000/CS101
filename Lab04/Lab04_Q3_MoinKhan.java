// Author : Moin Khan
// program to convert binary to decimal and Hexa values
import java.util.Scanner;

public class Lab04_Q3_MoinKhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binary;
        binary = " ";
        long decimal;
        decimal = 0;
        while (!(binary.compareToIgnoreCase("exit") == 0))
        {
            System.out.println("Enter binary number (exit to quit): ");
            binary = input.next();
            if ((binary.compareToIgnoreCase("exit") == 0))
            break;
                int remainder;
                remainder = 0;
                if (binary.length()%4 != 0)
                {
                    remainder = binary.length()%4;
                    while (remainder!=0)
                    {
                        binary = "0" + binary;
                        remainder--;
                    }
                }
                // Getting Decimal value from binary 
                int  x=1;
                while (x!=binary.length() +1)
                {
                     decimal += Character.getNumericValue(binary.charAt(binary.length()-x))*Math.pow(2, x-1);
                     x++;
                }
                System.out.println(decimal);
                decimal = 0;
                
                int counting = 1;
                String nibble = "";
                int decimalForHex = 0;
                String hexaDecimal = "";
                while(counting<=binary.length())
                {
                    nibble+=binary.charAt(binary.length()-counting);
                    int counting2 = 1;
                    if(nibble.length()==4)
                    {
                        StringBuilder stringB= new StringBuilder(nibble);
                        stringB.reverse();
                        nibble=stringB.toString();
                        while (counting2!=nibble.length()+1)
                        {
                        decimalForHex +=Character.getNumericValue(nibble.charAt(nibble.length()-counting2))*Math.pow(2,counting2-1);
                        counting2++;
                        }
                    nibble = "";
                    }
                    if(decimalForHex==0&&counting%4==0){
                        hexaDecimal+=0;
                    }
                    if(decimalForHex!=0){
                    if(decimalForHex<10)
                      hexaDecimal+=decimalForHex;
                    if(decimalForHex>10)
                      hexaDecimal+=(char)(decimalForHex+55);
                }
                decimalForHex = 0;
                counting++;
                }
                StringBuilder stringB2=new StringBuilder(hexaDecimal);
                stringB2.reverse();
                hexaDecimal=stringB2.toString();
                System.out.println("#"+hexaDecimal);
                



            

        }
        input.close();;
    }
}
