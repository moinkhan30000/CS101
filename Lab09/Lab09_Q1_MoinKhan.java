//Author : Moin Khan
// Program to take a list of number store it in arraylist and create a new arraylist with given specifications.
import java.util.ArrayList;
import java.util.Scanner;

public class Lab09_Q1_MoinKhan {
    //Method that take an arraylist as the parameter and remove all duplicates from it.
    public static void  removeDuplicates(ArrayList <Integer> s)
    {
        s.add(0,0);
        int z=0;
        for(int i = 0; i<s.size(); i++)
        {
            int temp = s.get(i);
            for (int j=0; j<s.size(); j++)
            {
                if(s.get(j) == temp)
                {
                    s.remove(j);
                    j=0;
                }
            }
            s.add(z, temp);
            z++;
        }
        s.remove(0);
        
    }
    // Method to take a list of number as string and store it in an arraylist.
    public static ArrayList <Integer> fillList(String s1)
    {
        int index;
        int temp ;
        s1 = s1.trim();
        s1 = s1 + " ";
        ArrayList <Integer> s2 = new ArrayList<Integer>();
        String tempString;
        index = s1.indexOf(" ");
        tempString = s1.substring(0, index).trim();
        temp = Integer.parseInt(tempString);
        s2.add(temp);
        int index2 = s1.indexOf(" ", index+1);
        
        while(index2 != -1)
        {
            tempString = s1.substring(index, index2).trim();
            index = index2;
            index2 =s1.indexOf(" ", index+1);
            temp = Integer.parseInt(tempString);
           
            s2.add(temp);
           
        }


        return s2;
    }
    // Method to take two arraylist and a divisor as parameter and store sum of number divisible by divisor in second arraylist.
    public static void sumDivisible(ArrayList<Integer> s1, ArrayList<Integer> s2,int divisor)
    {
        int sum = 0;
        int z=0;
        for(int i=0; i<s1.size(); i++)
        {
            if (s1.get(i)%divisor == 0)
            {
                sum = sum + s1.get(i);
            }
            s2.add(z,sum);
            z++;
        }
    }
       
    
    public static void main(String[] args)
    {
        String inputString;
        int divisor;
        ArrayList <Integer> firstList = new ArrayList<Integer>();
        ArrayList <Integer> updateSumList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values: ");
        inputString = input.nextLine();
        System.out.print("Enter divisor: ");
        divisor = input.nextInt();
        firstList = fillList(inputString);
        System.out.println("List: " + firstList);
        sumDivisible(firstList, updateSumList, divisor);
        System.out.println("Sum List: " + updateSumList);
        removeDuplicates(updateSumList);
        System.out.println("Sum List (no duplicates): " + updateSumList);
        input.close();

        
    }
    
}
