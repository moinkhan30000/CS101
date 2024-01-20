// author: Moin Khan
// Program to determıne a Given Fibonacci number
public class Lab01_Q4_MoinKhan {
    public static void main(String[] args) {
        final double GOLDENRATIO = (1+Math.sqrt(5))/2;
        double functionForn;
        int n=6;
        functionForn = ((Math.pow(GOLDENRATIO, n)-Math.pow(-1.0/GOLDENRATIO,n)) / Math.sqrt(5));
        System.out.println("Fibonacci (" + n + ") is " + functionForn);
        
    }    
}
// If we change the program output to int or long it gives a wrong answer for n after the sıze 
// exceed the size limit of int and long. For Example n = 100 exceed that limit.
