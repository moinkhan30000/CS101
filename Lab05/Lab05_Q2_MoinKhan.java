//Author: Moin Khan
//A program that inputs the mountain width from the user, displays the mountain and the calculated weight of the mountain.
import java.util.Scanner;

public class Lab05_Q2_MoinKhan {
    public static void main(String[] args) {
        int width;
        int lastCenterNumber;
        int mountainweight;
        int centerNumber;
        int controlVariable;
        Scanner input = new Scanner(System.in);
        //Here I check if the input is odd number or not if not program keep asking for new input.
        do
        {
            System.out.println("Enter mountain width: ");
            width = input.nextInt();
        }
        while( width % 2 == 0);
        lastCenterNumber = width - width/2;
        centerNumber = width;
        mountainweight = 0;
        int newWidth = width;
        controlVariable = newWidth/2;
        //In this do while loop I calculate the weight of mountain.
        do 
        {
            mountainweight = mountainweight + newWidth;
            for(int n =controlVariable; n>0; n--)
            {
                
                mountainweight = mountainweight + 2*(newWidth - 2);
                newWidth = newWidth -2;
            }
           centerNumber --;
           newWidth = centerNumber;
           controlVariable--;
        }
        while (centerNumber > lastCenterNumber);
        mountainweight = mountainweight+ width - width/2;
        int noOfRows;
        centerNumber = width;
        noOfRows = width - width/2;
        //In this for loop I create the shape of mountain using the numbers according to given algoritham.
        for (int i=0; i<noOfRows; i++)
        { 
            for (int j=i; j<noOfRows; j++)
            {
                System.out.print("\t");
                //System.out.print("\t");
            }
            for(int j=0; j<i; j++)
            {
                
                {
                    System.out.print((centerNumber-i+j)+ "\t");
                }
            }
            for(int j=0;  j<i+1; j++)
            {
                if (j==0)
               {
                System.out.print(centerNumber+"\t");
               }
                else
                {
                    System.out.print((centerNumber-j)+"\t");
                }
            }
           centerNumber--;
            System.out.println();
        }
        // Here I display the weight of mountain.
        System.out.println("Weight of mountain with width of " + width + " is " + mountainweight);
        input.close();
    }
    
}
