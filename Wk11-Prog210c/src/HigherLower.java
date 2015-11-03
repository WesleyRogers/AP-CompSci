/*
    Program 210c Higher or Lower?
    Wesley Rogers 
    11/3/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Generates a random number, then you have to guess what the number is using clues the program gives you.

    What I learned: Now much, pretty standard program. I did remember you can use a class without assigning it a variable name though.
    
    Difficulties: None.
*/
import java.util.Random;
import java.util.Scanner;

public class HigherLower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int randInt = (new Random()).nextInt(100) + 1; //Create an instance of the random class, then get a new int from it.
        int lastGuess;
        int guessNum = 0;
        System.out.println("I'm thinking of a number between 1 and 100...");
        do {
            System.out.print("Enter your guess: ");
            lastGuess = input.nextInt();
            guessNum++;
            if(lastGuess == randInt){
                System.out.println("You won in " + guessNum + " guesses!");
            } else if (lastGuess > randInt){
                System.out.println("You're a bit high. Try lower.");
            } else {
                System.out.println("You're a bit low. Try higher.");
            }
            
        } while (lastGuess != randInt);
        input.close();
    }

}
/* Sample Output
I'm thinking of a number between 1 and 100...
Enter your guess: 1
You're a bit low. Try higher.
Enter your guess: 50
You're a bit low. Try higher.
Enter your guess: 75
You're a bit high. Try lower.
Enter your guess: 60
You're a bit high. Try lower.
Enter your guess: 55
You're a bit high. Try lower.
Enter your guess: 51
You're a bit low. Try higher.
Enter your guess: 52
You're a bit low. Try higher.
Enter your guess: 53
You won in 8 guesses!
*/