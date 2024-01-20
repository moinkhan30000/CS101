// Author : Moin Khan
// Program to Find Weight on different Planets from given Choices.
import java.util.Scanner;

public class Lab03_Q2_MoinKhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // I create constant values for gravity constants of different planets
        final double venusG = 0.78 ;
        final double marsG = 0.39 ;
        final double jupiterG = 2.65 ;
        final double saturnG = 1.17 ;
        final double uranusG = 1.05 ; 
        final double neptuneG = 1.23 ;
        double weight ;
        int choice;
        System.out.print("Enter your weight: ");
        weight = input.nextDouble();
        // I use "if" statement to give a condition where proram run only if weight is gretaer than zero
        if (weight > 0)
        {
        System.out.printf("Choose the planet: %n        1-Venus %n        2-Mars %n        3-Jupiter %n");
        System.out.printf("        4-saturn %n        5-Uranus %n        6-Neptune %n");
        System.out.print("Choice: ");
        choice = input.nextInt();
        if (choice == 1)
        {
            weight = weight*venusG;
            System.out.printf("Your weight on planet 1 is %.1f" , weight);
        }
        else if (choice == 2)
        {
            weight = weight*marsG ;
            System.out.printf("Your weight on planet 2 is %.1f" , weight);
        }
        else if (choice == 3)
        {
            weight = weight*jupiterG;
            System.out.printf("Your weight on planet 3 is %.1f" , weight);
        }
        else if (choice == 4)
        {
            weight = weight*saturnG;
            System.out.printf("Your weight on planet 4 is %.1f" , weight);
        }
        else if (choice == 5)
        {
            weight = weight*uranusG;
            System.out.printf("Your weight on planet 5 is %.1f" , weight);
        }
        else if (choice == 6)
        {
            weight = weight*neptuneG;
            System.out.printf("Your weight on planet 1 is %.1f" , weight);
        }
        else {
            System.out.println("Invalid choice - quitting....");
        }
        }
        // I use "else if" to give an error if weight is less than zero
        else if (weight < 0)
        {
            System.out.println("Invalid weight, quitting.....");
        }
        input.close();
        }

    }

