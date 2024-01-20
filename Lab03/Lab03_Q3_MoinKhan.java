// Author : Moin Khan
// Program to Play a Version of 20 Questions
import java.util.Scanner;

public class Lab03_Q3_MoinKhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String objectType;
        String objectSize;
        System.out.println("Is the object an Animal/Vegetable/Mineral?");
        objectType = input.nextLine();
        // I use "compareToIgnoreCase" to make sure my program is not case sensitive
        // I use "if" to give condition to run program only if objectType is same as given specific Strings
        if (objectType.compareToIgnoreCase("animal") == 0)
        {
            System.out.println("Is the object bigger than a shoe box?");
            objectSize = input.nextLine();
            // I use "if" to run program only if objectSize is same as given specific Strings
            if (objectSize.compareToIgnoreCase("yes") == 0)
            {
                System.out.println("I know, it's a elephant!");
            }
            else if (objectSize.compareToIgnoreCase("no") == 0)
            {
                System.out.println("I know, it's a squirrel!");
            }
            else 
            // Here it gives an error if objectSize does not match any strings
            {
                System.out.println("I don't understand, \"" + objectSize + "\" is not a valid answer.");   
            }
        }
        else if (objectType.compareToIgnoreCase("vegetable") == 0)
        {
            System.out.println("Is the object bigger than a shoe box?");
            objectSize = input.nextLine();
            if (objectSize.compareToIgnoreCase("yes") == 0)
            {
                System.out.println("I know, it's a pumpkin!");
            }
            else if (objectSize.compareToIgnoreCase("no") == 0)
            {
                System.out.println("I know, it's a carrot!");
            }
            else 
            {
                System.out.println("I don't understand, \"" + objectSize + "\" is not a valid answer.");
            }
        }
        else if (objectType.compareToIgnoreCase("mineral") == 0)
        {
            System.out.println("Is the object bigger than a shoe box?");
            objectSize = input.nextLine();
            if (objectSize.compareToIgnoreCase("yes") == 0)
            {
                System.out.println("I know, it's a bus!");
            }
            else if (objectSize.compareToIgnoreCase("no") == 0)
            {
                System.out.println("I know, it's a pencil!");
            }
            else 
            {
                System.out.println("I don't understand, \"" + objectSize + "\" is not a valid answer.");  
            }
        }
        else {
            System.out.println("I don't understand, \"" + objectType + "\" is not a valid answer.");
        }
        input.close();
        
    }
}
