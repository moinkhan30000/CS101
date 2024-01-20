// Author : Moin Khan
// Program to Calculate Weight on other mentioned Planets.
import java.util.Scanner;

public class Lab02_Q1_MoinKhan {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        final double MERCURYGRAVITY = 0.38;
        final double VENUSGRAVITY = 0.91;
        final double MARSGRAVITY = 0.38;
        final double JUPITERGRAVITY = 2.34;
        int firstEarthling;
        int secondEarthling;
        System.out.println("Enter weight of first earthling(kg)");
        firstEarthling = Input.nextInt();
        System.out.println("Enter weight of Second earthling(kg)");
        secondEarthling = Input.nextInt();
        System.out.printf("%30s  %5s  %5s  %5s %n", "MERCURY", "VENUS", "MARS", "JUPITER");
        System.out.printf("EARTHLING ONE(%.1f kg)  %4.1f %8.1f %6.1f %8.1f %n", (double) firstEarthling, firstEarthling*MERCURYGRAVITY, firstEarthling*VENUSGRAVITY,
        firstEarthling*MARSGRAVITY, firstEarthling*JUPITERGRAVITY);
        System.out.printf("EARTHLING TWO(%.1f kg) %4.1f %8.1f %6.1f %8.1f %n", (double) secondEarthling, secondEarthling*MERCURYGRAVITY, secondEarthling*VENUSGRAVITY,
        secondEarthling*MARSGRAVITY, secondEarthling*JUPITERGRAVITY);
        Input.close();

        
      



        
        
    }
    
}
