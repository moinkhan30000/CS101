// Author : Moin Khan
// program to create a notebook by asking user to enter number of pages and page size and then it gives user option to take notes and view them.
import java.util.Scanner;

public class Diary {
    public static void main(String[] args) {
    int choice = 0;
    int numberOfPages;
    int pageSize;
    String m;
    // Program asking user to enter number of pages and page size.
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of pages: ");
    numberOfPages = input.nextInt();
    System.out.print("Enter page size: ");
    pageSize = input.nextInt();
    System.out.println("-----------------------------------------------------");
    NoteBook s = new NoteBook(numberOfPages, pageSize);
    // While loop to keep program running until user choose option 3 to Exit
    while(choice != 3)
    {
        System.out.print(" What do you want to do? \n (1) Take a note \n (2) Browse notebook \n (3) Exit \n");
        System.out.print("Your choice: ");
        choice = input.nextInt();
        // If user select option 1 Program ask to enter note and let you store it in the notebook until all pages are full.
        if (choice == 1)
        {
            int controlvariable;
            int currentPageIndex;
            controlvariable = s.getPageCount();
            currentPageIndex = s.getCurrentPageIndex();
            input.nextLine();
            System.out.print("Enter note: ");
            m = input.nextLine();
            if(currentPageIndex < controlvariable)
            {
                s.writeNote(m);
            }
            else
            {
                System.out.println("Notebook full! No pages remaining!");
            }
            
        }
        // Option to view the stored notes in Notebook
        else if (choice == 2)
        {
            s.printNotebook();
        }
        System.out.println("-----------------------------------------------------");
    }
    System.out.println("Goodbye...");
    input.close();
    }
    

    
}
