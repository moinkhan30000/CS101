//Author : Moin Khan
// A class to develop methods to play the quiz as per the specifications given.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FlashCardQuiz {
    public static Scanner input = new Scanner(System.in);
    private ArrayList<FlashCard> cardList = new ArrayList<FlashCard>();
    private ArrayList<FlashCard> quizlList = new ArrayList<FlashCard>();   
    private Player playerInfo;  
    public Player getPlayerInfo()
    {
        return this.playerInfo;
    }
    // Method that store a file into arraylist by taking String filename as the parameter
    public void loadCards(String fileName)  throws FileNotFoundException
    {
        Scanner inFile = new Scanner( new File(fileName) );
        while( inFile.hasNext() )
        {
            String question = inFile.next();
            String answer = inFile.next();
            int difficulty = inFile.nextInt();
            FlashCard card = new FlashCard(question, answer, difficulty);
            cardList.add(card);

        }
        
    }
    // Method to prompt user to enter number of flash cards to display as parameter and store that many random unique cards in quizlist.
    public void initializeQuiz()
    {
        System.out.print("Enter the number of flash cards to generate: ");
        int numberOfCards = input.nextInt();
        Collections.shuffle(cardList);
        for(int i = 0 ; i<numberOfCards; i++)
        {
           quizlList.add(cardList.get(i));
           
        }
    }
    //This method is used to ask the questions and show answer if answered incorrectly and give points and count number of games played by a player.
    public void takeQuiz()
    {
        int points = 0;
        String answer;
        int size = quizlList.size();
        for(int i = 0 ; i<size; i++)
        {
            quizlList.get(i).showFlashCard();
            System.out.println("Answer:");
            answer = input.next();
            if(answer.equalsIgnoreCase(quizlList.get(i).getAnswer()))
            {
                points++;
                System.out.println("Correct!\n");
            }
            else
            {
                quizlList.get(i).flipFlashCard();
                System.out.println("Wrong Answer\n");
            }

        }  
        playerInfo.setHighScore(points);
        playerInfo.increaseGamesPlayed();
    }
    public FlashCardQuiz(String fileName,Player playerInfo) throws FileNotFoundException
    {
        loadCards(fileName);
        this.playerInfo = playerInfo;
        initializeQuiz();
        
    }
    
}
