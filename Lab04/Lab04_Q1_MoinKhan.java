// Author : Moin Khan
// Program to find second string in alphabetical order by taking input strings.
import java.util.Scanner;

public class Lab04_Q1_MoinKhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String beforeString;
        String secondString;
        String afterString;
        System.out.println("Enter strings (exit to stop):");
        beforeString = input.next();
        if (!(beforeString.compareToIgnoreCase("exit") == 0))
        {
            secondString = input.next();
        // Here this if condition is used to make sure that user at least input two strings to compare other than "exit"
        if (!(secondString.compareToIgnoreCase("exit") == 0))
        {
            afterString = input.next();
            // Here this while condition is used to make sure that program keep going until user enters "exit".
            while(!(afterString.compareToIgnoreCase("exit") == 0))
        {   // These if conditions are used to select second alphabetical order string in all possible situations
            if (secondString.compareToIgnoreCase(beforeString) > 0 && secondString.compareToIgnoreCase(afterString) < 0)
          {
                  afterString = input.next();
          }
          else if (secondString.compareToIgnoreCase(afterString) > 0 && secondString.compareToIgnoreCase(beforeString) < 0)
          {
              beforeString = afterString;
              afterString = input.next();
          }
          else if (beforeString.compareToIgnoreCase(afterString) > 0 && beforeString.compareToIgnoreCase(secondString) < 0)
          {
              secondString = beforeString;
              beforeString = afterString;
              afterString = input.next();
          }  
          else if (beforeString.compareToIgnoreCase(secondString) > 0 && beforeString.compareToIgnoreCase(afterString) < 0)
          {
              afterString = beforeString;
              beforeString = secondString;
              secondString = afterString;
              afterString = input.next();
          }
          else if (afterString.compareToIgnoreCase(beforeString) > 0 && afterString.compareToIgnoreCase(secondString) < 0)
          {
              secondString = afterString;
              afterString = input.next();
          }
          else if (afterString.compareToIgnoreCase(secondString) > 0 && afterString.compareToIgnoreCase(beforeString) < 0)
          {
              beforeString = secondString;
              secondString = afterString;
              afterString = input.next();
          }
          else if (beforeString.compareToIgnoreCase(secondString) == 0 && secondString.compareToIgnoreCase(afterString) < 0)
          {
              secondString = afterString;
              afterString = input.next();
          } 
          else if (beforeString.compareToIgnoreCase(secondString) == 0 && secondString.compareToIgnoreCase(afterString) > 0)
          {
              afterString = input.next();
          }
          else if (secondString.compareToIgnoreCase(afterString) == 0 && secondString.compareToIgnoreCase(beforeString) < 0)
          {
              secondString = beforeString;
              beforeString = afterString;
              afterString = input.next();
          }
          else if (secondString.compareToIgnoreCase(afterString) == 0 && secondString.compareToIgnoreCase(beforeString) > 0)
          {
              afterString = input.next();
          }
          else if (beforeString.compareToIgnoreCase(afterString)== 0 && beforeString.compareToIgnoreCase(secondString) < 0)
          {
              afterString = input.next();
          }
          else if (beforeString.compareToIgnoreCase(afterString)== 0 && beforeString.compareToIgnoreCase(secondString) > 0)
          {
              secondString = afterString;
              afterString = input.next();
          }
        } // This if condition is used to make sure that user don't input all the same strings and if do gets an error message
        if (!(beforeString.compareToIgnoreCase(secondString) == 0))
          {
            System.out.println("String that comes second alphabetically: " + secondString);
          }
          else
          {
            System.out.println("Not enough input data...");
          }
        }
        else
        {
            System.out.println("Not enough input data...");
        }
        }
        else 
        {
        System.out.println("Not enough input data...");
        }
        input.close();
    }
}
