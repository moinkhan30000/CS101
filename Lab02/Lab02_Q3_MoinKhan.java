// Author : Moin Khan
// Program to Calculate Calories required, Grams Protien, Grams Fat, Grams Carbs.
import java.util.Scanner;

public class Lab02_Q3_MoinKhan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        final double PAL = 1.4;
        double weight;
        double height;
        double age;
        double bmr;
        double calories;
        System.out.println("Enter your weight(kg), height(cm) and age:");
        weight = Input.nextDouble();
        height = Input.nextDouble();
        age = Input.nextDouble();
        bmr = ( (10 * weight) + (6.25 * height) - (5 * age) - 161);
        calories = bmr*PAL;
        System.out.printf("Calories required : %10.2f %n", calories);
        System.out.printf("    GRAMS PROTEIN : %10.2f %n", (0.25*calories) / 4);
        System.out.printf("        GRAMS FAT : %10.2f %n", (0.3*calories) / 9);
        System.out.printf("      GRAMS CARBS : %10.2f %n", (0.45*calories) / 4);
        Input.close();



    }
    
}
