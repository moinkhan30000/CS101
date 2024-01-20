//Author: Moin Khan
//Program to calculate the given functıon
public class Lab01_Q3_MoinKhan {
    public static void main(String[] args) {
        int x = -5;
        // Defining function y as described is the given question
        int y = (int) ( ( Math.pow(x, 3) + (3 * Math.abs(x) ) + 9 ) / Math.pow(x, 2)) ;
        System.out.println( "The result of the expression : " + y);

    }
}
