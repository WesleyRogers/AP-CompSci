import java.util.Scanner;

/*
    Program 388z Rock Paper Scissors
    Wesley Rogers 
    2/8/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Plays a game of rock paper scissors against the computer.
    
    What I learned: Not much, pretty simple.
    
    Difficulties: The requirements for the program that were laid out in the doc were rather unintuitive as there are much better ways to store the information such as,
    making the CPU just another player object, passing the player in a constructor so that we don't need to keep track of the name and throw, and ACTUALLY using the player object rather than it being there and doing nothing.
    I knda had to shoehorn it in and it felt... awkward.
*/
public class GameDrive {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = input.nextLine();
        
        Player p = new Player(name);
        
        System.out.println("1. Rock, 2. Paper, 3. Scissors");
        System.out.print("What is your guess? ");
        switch (input.nextInt()){
            case 1: p.makeThrow('r'); break;
            case 2: p.makeThrow('p'); break;
            case 3: p.makeThrow('s'); break;
            default: System.out.println("Play a number above!"); System.exit(1); //If they don't play a number from 1-3, exit out.
        }
        
        Game game = new Game();
        game.makeCompThrow();
        
        game.announceWinner(p.getName(), p.getThrow());
    }

}
/*
What is your name? wes
1. Rock, 2. Paper, 3. Scissors
What is your guess? 1
The computer rolls: Paper!
The Computer wins!

What is your name? wes
1. Rock, 2. Paper, 3. Scissors
What is your guess? 2
The computer rolls: Paper!
There's a tie! Nobody wins!

What is your name? wes
1. Rock, 2. Paper, 3. Scissors
What is your guess? 3
The computer rolls: Paper!
wes wins!

*/