/*
    Program 512h Three Letter Words
    Wesley Rogers 
    12/7/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the percentage of three letter words in a passage lacking punctuation.

    What I learned: Not much, strings are easy.
    
    Difficulties: None.
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThreeLetters {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        int allWords = 0;
        int threeLetterWords = 0;
        try {
            input = new Scanner(new File("prog512h.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        while(input.hasNext()){
            if (input.next().length() == 3){
                threeLetterWords++;
            }
            allWords++;
        }
        System.out.println("Three letter words comprised " + 100*(threeLetterWords+0.0)/allWords + "% of all words.");
        
    }

}
/*
Three letter words comprised 21.50537634408602% of all words.
*/