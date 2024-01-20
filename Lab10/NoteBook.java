// Author : Moin Khan
// Program to create a class for Notebook to store a number of pages from Page class in an array.
public class NoteBook {
    private Page[] pages;
    private int currentPageIndex;
    // Constructor to Initialize the values.
    public NoteBook(int pageCount, int pageSize)
    {
        pages = new Page[pageCount];
        for (int i=0; i<pageCount; i++)
        {
            pages[i] = new Page(pageSize);
        }
        currentPageIndex = 0;
        
    }
    // Method to take a String as parameter and store it into pages in Page class array.
    public void writeNote(String m)
    {
        
        pages[currentPageIndex].writePage(m);
        currentPageIndex++;
        
    }
    // method to printout the stored pages in the Page class Array.
    public void printNotebook()
    {
        System.out.println("Here's your Notebook:");
        for (int i=0; i<pages.length; i++)
        {
           String s = pages[i].toString();
           System.out.println(i + ".       " + s);
        }
    }
    // Method to get Current page Index
    public int getCurrentPageIndex()
    {
        int index = currentPageIndex;
        return index;
    }
    // Method to get total Page count of the created notebook.
    public int getPageCount()
    {
        int count = pages.length;
        return count;
    }
    
}
