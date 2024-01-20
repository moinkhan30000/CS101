//Author : Moin Khan
// A program to calculate different Fitness criteria 
import java.time.LocalDate;
import java.util.Scanner;


public class FitnessApp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int choice = 1;
        String birthDate;
        String gender;
        double height;
        double weight;
        double waist;
        double hips;
        double restingHeartRate;
        double age;
        String tempString;
        int tempIndex;
        // Getting input value from user for all the variables
        System.out.print("Enter birthdate (YYYY-MM-DD): ");
        birthDate = input.nextLine();
        System.out.print("Enter gender (f)emale/(m)ale: ");
        gender = input.nextLine();
        System.out.print("Enter height(m) weight(kg): ");
        tempString = input.nextLine();
        tempString = tempString.trim();
        tempIndex = tempString.indexOf(" ");
        height = Double.parseDouble(tempString.substring(0, tempIndex));
        weight = Double.parseDouble(tempString.substring(tempIndex+1).trim());
        System.out.print("Enter waist and hip measurments : ");
        tempString = input.nextLine();
        tempString = tempString.trim();
        tempIndex = tempString.indexOf(" ");
        waist = Double.parseDouble(tempString.substring(0, tempIndex).trim());
        hips = Double.parseDouble(tempString.substring(tempIndex+1).trim());
        System.out.print("Enter resting heart rate: ");
        restingHeartRate = input.nextDouble();
        // passing the values into the object of FitnessAssessment class using constructor
        FitnessAssessment f1 = new FitnessAssessment(height, weight, restingHeartRate, waist, hips, gender, birthDate);
        // Making a while condition so program keep running until you choose quit
        while (choice != 5)
        {
        System.out.printf("--------------MENU--------------%n");
        System.out.printf("1 - Calculate Target Heart Rate%n");
        System.out.printf("2 - Calculate Waist/Hip Ratio%n");
        System.out.printf("3 - Body Mass Index%n");
        System.out.printf("4 - Display Fitness Level%n");
        System.out.printf("5 - Quit%n");
        System.out.print("Enter choice: ");
        choice = input.nextInt();
        if (choice == 1)
        {
            LocalDate bDate = f1.getBirthdate();
            age = f1.currentAge(bDate);
            double maxHeartRate = f1.calculateMaxHeartRate(age);
            double targetHeartRate = f1.calculateTargetHeartRate(maxHeartRate);
            System.out.printf("Target Heart Rate: %.1f %n" , targetHeartRate);

        }
        else if (choice == 2)
        {
            double waistHipRatio = f1.waistHipRatio(waist, hips);
            System.out.println("Waist/Hip Ratio: " + waistHipRatio);

        }
        else if (choice ==3)
        {
            double BMI = f1.calculateBMI(weight, height);
            System.out.printf("Your BMI is: %.1f  ", BMI);
            String category = f1.findBMICategory(BMI);
            System.out.println(" Category : " + category);
        }
        else if (choice == 4)
        {
            String fitness = f1.determineFitnessLevel(gender, f1.calculateBMI(weight, height), restingHeartRate, f1.waistHipRatio(waist, hips));
            System.out.println("Your fitness level is: " + fitness);
        }
        }
        input.close();
        

    }
    
}
