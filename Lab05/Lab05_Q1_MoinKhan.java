//Author : Moin Khan
//Program to that displays a menu and based on the choice from the user, executes the task.
import java.util.Scanner;

public class Lab05_Q1_MoinKhan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 1;
        int number;
        int number2;
        int reverseNumber = 0;
        int remainder = 0;
        // do while loop is used here to keep program running until user select quit.
        do
        {
            // "If" statement is used to make sure choices made by user are valid between 1-3.
        if (choice > 0 && choice < 4)
        {
            System.out.printf("Menu: %n      1 - Special Number %n      2 - Vowel Word %n      3 - Quit %nEnter Choice :");
            choice = input.nextInt();
            // Here in this "if" condition it is checked whether the number is special according to given conditions.
            if(choice == 1)
            {
                String numberString;
                do
                {
                System.out.println("Enter Number: ");
                numberString = input.next();
                number = Integer.parseInt(numberString);
                }
                while (!(numberString.length() == 4));
                
                number2 = number;
                do
                {
                    remainder = number2 % 10;
                    reverseNumber = reverseNumber*10 + remainder;
                    number2 = number2/10;
                }  
                while(number2 !=0);               
                if( 4*number == reverseNumber)
                {
                    System.out.println(number + " is a very special number");
                }
                else
                {
                    System.out.println(number + " is not a very special number");
                }
                reverseNumber = 0;
                remainder = 0;
                
            }// Here in this "else if" condition it is checked whether a word is vowel word or not.
            else if(choice == 2)
            {
                String word;
                String word2;
                System.out.println("Enter Word: ");
                word = input.next();
                word2 = word.toLowerCase();
                if(word2.contains("a") && word2.contains("e") && word2.contains("i") && word2.contains("o") && word2.contains("u"))
                {
                    System.out.println(word + " is a vowel word");
                }
                else
                {
                    System.out.println(word + " is not a vowel word");
                }
            }
        }// "else" condition to show error message if choice selected is out of given parameters.
        else
        {
            System.out.println("Choice must be between 1 and 3!");
            choice = 1;
        }
        }
        while(!(choice ==3));
        System.out.println("Goodbye!");
        input.close();
        

    }
    
}
