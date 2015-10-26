/*
    Program 164f Silly Number Sequences
    Wesley Rogers 
    10/19/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the sqrares between 1-100, with one set backwards.

    What I learned: Not too much, while loops can be annoying though. The for loop was by far the easiest.
    
    Difficulties: The while loop was being a bit weird until I changed something, it wasn't printing the first term.
*/

public class TripleSequence {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int number = 1;
        int odd =19; //for use in the while loop
        
        System.out.println("For Loop");
        for(int i = 3; i<=21; i+=2){ // i increases by two so that it is an odd number each time. 20 is limit because all the odd numbers inbetween 1-21 sum to 100
            System.out.print(number + " ");
            number += i;
        }
        System.out.println("\n\nWhile Loop");
        number = 100;
        
        while (number >= 1){ //odd decreases by two to maintain oddity and it goes backwards
            System.out.print((number)+" ");
            number -=odd;
            odd -=2;
        }
        
        System.out.println("\n\nDo...While Loop");
        number = 1;
        odd = 3;
        do{ // odd goes up again
            System.out.print(number + " ");
            number += odd;
            odd+=2;
            
        } while(number <= 100);
        
        
        
        
        
    }

}
/*
For Loop
1 4 9 16 25 36 49 64 81 100 

While Loop
100 81 64 49 36 25 16 9 4 1 

Do...While Loop
1 4 9 16 25 36 49 64 81 100 
*/