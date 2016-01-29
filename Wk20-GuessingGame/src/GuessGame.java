import java.util.Scanner;
/* Alterations made by Wesley Rogers */
public class GuessGame {
     Player p1;
     Player p2;
     Player p3;
     public void startGame() {
         p1 = new Player();
         p2 = new Player();
         p3 = new Player();
        
         int guessp1 = 0;
         int guessp2 = 0;
         int guessp3 = 0;
         int count = 0;
         boolean p1isRight = false;
         boolean p2isRight = false;
         boolean p3isRight = false;
         int targetNumber = (int) (Math.random() * 10);
         Scanner input = new Scanner(System.in);
         String p1Name;
         String p2Name;
         String p3Name;
         
         System.out.print("Player 1, what is your name? ");
         p1Name = input.next();
         System.out.print("Player 2, what is your name? ");
         p2Name = input.next();
         System.out.print("Player 3, what is your name? ");
         p3Name = input.next();
         
         System.out.println("I知 thinking of a number between 0 and 9...");
         while(true) {
             System.out.println("Number to guess is " + targetNumber);
             p1.guess();
             p2.guess();
             p3.guess();
             
             guessp1 = p1.number;
             System.out.println(p1Name + " guessed " + guessp1);
             guessp2 = p2.number;
             System.out.println(p2Name + " guessed " + guessp2);
             guessp3 = p3.number;
             System.out.println(p3Name + " guessed " + guessp3);
             
             count++;
             
             if (guessp1 == targetNumber) {
                 p1isRight = true;
             }
             if (guessp2 == targetNumber) {
                 p2isRight = true;
             }
             if (guessp3 == targetNumber) {
                 p3isRight = true;
             }
             if (p1isRight || p2isRight || p3isRight) {
                 System.out.println("\nWe have a winner!");
                 System.out.println("Did " + p1Name + " get it right? " + p1isRight);
                 System.out.println("Did " + p2Name +" get it right? " + p2isRight);
                 System.out.println("Did " + p3Name + " get it right? " + p3isRight);
                 System.out.println("Game is over after " + count + " rounds.");
                 break; // game over, so break out of the loop
             } else {
                 // we must keep going because nobody got it right!
                 System.out.println("All players will have to try again! We are on round " + count + ".\n");
             } // end if/else
         } // end loop
     } // end method
} 
/*
Player 1, what is your name? 1
Player 2, what is your name? 2
Player 3, what is your name? 3
I知 thinking of a number between 0 and 9...
Number to guess is 1
I知 guessing 8
I知 guessing 0
I知 guessing 3
1 guessed 8
2 guessed 0
3 guessed 3
All players will have to try again! We are on round 1.

Number to guess is 1
I知 guessing 5
I知 guessing 8
I知 guessing 7
1 guessed 5
2 guessed 8
3 guessed 7
All players will have to try again! We are on round 2.

Number to guess is 1
I知 guessing 4
I知 guessing 6
I知 guessing 7
1 guessed 4
2 guessed 6
3 guessed 7
All players will have to try again! We are on round 3.

Number to guess is 1
I知 guessing 9
I知 guessing 8
I知 guessing 9
1 guessed 9
2 guessed 8
3 guessed 9
All players will have to try again! We are on round 4.

Number to guess is 1
I知 guessing 7
I知 guessing 6
I知 guessing 7
1 guessed 7
2 guessed 6
3 guessed 7
All players will have to try again! We are on round 5.

Number to guess is 1
I知 guessing 6
I知 guessing 6
I知 guessing 4
1 guessed 6
2 guessed 6
3 guessed 4
All players will have to try again! We are on round 6.

Number to guess is 1
I知 guessing 9
I知 guessing 2
I知 guessing 5
1 guessed 9
2 guessed 2
3 guessed 5
All players will have to try again! We are on round 7.

Number to guess is 1
I知 guessing 7
I知 guessing 8
I知 guessing 6
1 guessed 7
2 guessed 8
3 guessed 6
All players will have to try again! We are on round 8.

Number to guess is 1
I知 guessing 0
I知 guessing 0
I知 guessing 7
1 guessed 0
2 guessed 0
3 guessed 7
All players will have to try again! We are on round 9.

Number to guess is 1
I知 guessing 3
I知 guessing 1
I知 guessing 9
1 guessed 3
2 guessed 1
3 guessed 9

We have a winner!
Did 1 get it right? false
Did 2 get it right? true
Did 3 get it right? false
Game is over after 10 rounds.
*/