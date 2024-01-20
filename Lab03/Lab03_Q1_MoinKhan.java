// Author : Moin Khan
// Program to find Boarding Group by Surnames.
import java.util.Scanner;

public class Lab03_Q1_MoinKhan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String surnames;
        int dashIndex;
        int firstIndex;
        char firstSurname;
        char secondSurname;
        char useToFindGroup;
        firstIndex = 0 ;
        System.out.println("Enter names of passengers : ");
        surnames = Input.nextLine();
        dashIndex = surnames.indexOf("-");
        // I use "charAt" to assign char values from main string from specific index to char in my program
        firstSurname = surnames.charAt(firstIndex);
        secondSurname = surnames.charAt(dashIndex + 1);
        // I use "Character.compare" to find out which char comes first in alphabetical order
        if (Character.compare(firstSurname , secondSurname) < 0) 
        {
            useToFindGroup = firstSurname ;
        }
        else {
            useToFindGroup = secondSurname ;
        }
        // I use "if" to give a condition to oniy run the program if my char lies between given specific characters
        if ( (useToFindGroup >= 'a' && useToFindGroup <= 'f') || (useToFindGroup >= 'A' && useToFindGroup <= 'F') ) 
        {
            System.out.println("BOARDING GROUP 1");
        }
        else if ( (useToFindGroup >= 'g' && useToFindGroup <= 'n') || (useToFindGroup >= 'G' && useToFindGroup <= 'N') )
        {
            System.out.println("BOARDING GROUP 2");
        }
        else if ( (useToFindGroup >= 'o' && useToFindGroup <= 't') || (useToFindGroup >= 'O' && useToFindGroup <= 'T') )
        {
            System.out.println("BOARDING GROUP 3");
        }
        else if ( (useToFindGroup >= 'u' && useToFindGroup <= 'z') || (useToFindGroup >= 'U' && useToFindGroup <= 'Z') )
        {
            System.out.println("BOARDING GROUP 4");
        }
        Input.close();




    }
}

    