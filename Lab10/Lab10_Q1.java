//Author : Moin Khan
public class Lab10_Q1 {
    // Method two take an integer array as an parameter and make changes to it according to given specification.
    public static int[] makeAdjacent(int s[])
    {
        int size = s.length;
        int controlIndex = size-1;
        int controlIndex2 = 1;
        for (int i = 0; i<size; i++)
        {
            if(!(s[i]==4 && s[i+1]==5))
            {
                if(s[0]==4)
            {
                if (s[i]==4)
                {
                    for(int j =controlIndex; j>i;j--)
                    {
                        s[j]=s[j-1];
                    }
                    s[i+1]=5;
                }
            }
            else if (s[0]!=4)
            {
                if (s[i]==4)
                {
                    for(int j =0; j<i;j++ )
                    {
                        s[controlIndex2+j-1] = s[controlIndex2+j];
                    }
                    s[i]=5;
                }
            }
            }
            
        }

        return s;
    }
    /* Method two take a two dimensional integer array and take rows of integers put them into another array and pass 
    that array through makeAdjecent method and print the results
    */
    public static void testAdjacent(int s[][])
    {
        int noOfRows = s.length;
        int noOfColumns;
        for(int i=0; i<noOfRows; i++)
        {
            noOfColumns = s[i].length;
            int s2[] = new int[noOfColumns];
            for(int j = 0; j< noOfColumns; j++)
            {
                s2[j] = s[i][j];
            }
            System.out.print("Original : [");
            for(int z=0; z<s2.length; z++)
            {
                System.out.print(s2[z]);
                if(z<s2.length-1)
                {
                    System.out.print(",");
                }
            }
            System.out.print("] ");
            s2 = makeAdjacent(s2);
            System.out.print("Result : [");
            for(int z=0; z<s2.length; z++)
            {
                System.out.print(s2[z]);
                if(z<s2.length-1)
                {
                    System.out.print(",");
                }
            }
            System.out.print("]\n");
        }

        
    }
    // Main method to create a 2d array and passing it into above created methods.
    public static void main(String[] args) {
        int s[][]={{5, 4, 9, 4, 9, 5},{4, 2, 4, 5, 5},{5, 4, 5, 4, 1},{5, 4, 1},{1,1,1},{4,5}};
        testAdjacent(s);
    }
    
}
