/*
    Program 230h Egg Mystery
    Wesley Rogers 
    10/29/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the minimum number of eggs if several conditions are true

    What I learned: Not much, conditionals are easy.
    
    Difficulties: None.
*/
public class EggMystery {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 1; i<1000; i++){ //i is the number of eggs in the basket.
            //If the basket has all of those things, print it and close.
            if(i%2 == 1 && i%3 == 2 && i%4 == 3 && i%5 == 4 && i%6 == 5 && i%7 ==0){ //That is a big condition.
                System.out.println("The basket contains " + i + " eggs.");
                System.exit(0);
            }
        }
    }

}
/*
The basket contains 119 eggs.
*/