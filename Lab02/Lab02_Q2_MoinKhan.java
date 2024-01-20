// Author : Moin Khan
// Program to show Country Code, Area code, Phone Number.
import java.util.Scanner;

public class Lab02_Q2_MoinKhan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String inputNumber;
        System.out.println("Enter phone number:");
        inputNumber = Input.nextLine();
        int parenthesis1 = inputNumber.indexOf("(");
        int parenthesis2 = inputNumber.indexOf(")");
        int dash1 = inputNumber.indexOf("-");
        int dash2 = inputNumber.indexOf("-",dash1+1);
        System.out.println("Country Code :  " + inputNumber.substring(parenthesis1 + 1, parenthesis2).trim() );
        System.out.println("   Area Code : " + inputNumber.substring(parenthesis2 + 1, dash1 ).trim());
        System.out.println("Phone Number : " + inputNumber.substring(dash1 + 1, dash2).trim() + " - " + inputNumber.substring(dash2 + 1).trim().substring(0,2) +
         " " + inputNumber.substring(dash2 + 1).trim().substring(2));
        Input.close();
        

       



        
    }



}    

