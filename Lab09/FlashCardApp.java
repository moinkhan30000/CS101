// Author : Moin Khan
// Program to play a game according to given specification.
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class FlashCardApp {
    public static void main(String[] args) throws FileNotFoundException {
        int choice = 0;
        FlashCardQuiz.input = new Scanner( System.in);
        ArrayList<Player> playerList = new ArrayList<Player>();
        // While loop to keep program running until choice 3 quit is selected.
        while(choice!=3)
        {
            System.out.println(" 1 - Play Game \n 2 - View Player Information \n 3 - Quit");
        System.out.print("Choice: ");
        choice = FlashCardQuiz.input.nextInt();
        // Choice 1 make you enter name and play the game.
        if(choice == 1)
        {
            System.out.print("Enter player name: ");
            String playerName = FlashCardQuiz.input.next();
            Player p =new Player(playerName);
            boolean f = false;
            for(int i=0; i<playerList.size(); i++)
            {
                if (p.equals(playerList.get(i)))
                {
                    f = true;
                }
            }
            if (f == true)
            {
                FlashCardQuiz quiz = new FlashCardQuiz("turkish_english_words.txt", playerList.get(0));
                quiz.takeQuiz();
                
            }
            else
            {
                FlashCardQuiz quiz = new FlashCardQuiz("turkish_english_words.txt", p);
                quiz.takeQuiz();
                playerList.add(0,quiz.getPlayerInfo());
            }
            

        }
        // choice 2 shows the current player details.
        if (choice == 2)
        {
            System.out.println(playerList.get(0).toString());
        }




        }
        

    }
}
