// Author : Moin Khan
public class Page {
    private char[] contents;
    // constructor initialize the Page by passing the page size as the parameter.
    public Page(int n)
    {
        contents = new char[n];
        for(int i =0; i<n; i++)
        {
            this.contents[i]='-';
        }
    }
    // Method to write in a page by passing a string as parameter and then storing it into the contents array.
    public void writePage(String s)
    {
        int stringSize= s.length();
        int arraySize = contents.length;
        int i = 0;   
        for(int j =0; j<stringSize; j++)
        {
            contents[j] = s.charAt(j);
            i++;
            if(i>=arraySize)
            {
                break;
            }
            
        }
    }
    // Method to return the data stored in Content array as a String.
    public String toString()
    {
        String s = "";
        for(int z=0; z<contents.length; z++)
        {
            s = s+ contents[z];
        }
        return s;
    }

    
}
