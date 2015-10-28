/*
    Program 209b Rolling Three Dice
    Wesley Rogers 
    10/28/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the number of combinations that will give you a sum of ten.

    What I learned: Make sure your variable names are straight!
    
    Difficulties: I was having some difficulty arising from an infinite loop in one of the if statements, so I rewrote the whole thing and it worked!
*/

public class RollingDice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //I have a lot if declared variables.
        int sum = 0;
        int tens = 0;
        int nines = 0;
        int d1 = 1; //Die 1
        int d2 = 1; //Die 2
        int d3 = 1; //Die 3
        
        while (d1<7) {
            sum = d1 + d2 + d3;
            
            if (d3<6){
                d3++;
            } else if (d3 == 6){
                d3 = 1;
                d2++;
            }
            
            if (d2 == 7){
                d2 = 1;
                d1 += 1;
            }
            
            
            //increment the nines or the tens if the sum is 9 or 10
            if (sum == 9){
                nines +=1;
            } else if (sum ==10){
                tens +=1;
            }
            
            

            
        }
        System.out.println("There are " + nines + " ways to get nine using dice.");
        System.out.println("There are " + tens + " ways to get ten using dice.");
    }

}
/* Sample Output
There are 25 ways to get nine using dice.
There are 27 ways to get ten using dice.
*/