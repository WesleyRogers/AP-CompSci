/*
    Program 166c More Asterisk per Asterisk
    Wesley Rogers 
    10/14/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you a pyramid shape of asterisks

    What I learned: Not much. Sometimes subtracting a constant by a variable and be useful.
    
    Difficulties: Nothing really.
*/

public class AsteriskPerAsterisk {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for(int i = 1; i < 7; i++){ //i is the row
            for(int k = 1; k<=(6-i); k++){ //Getting the spaces together.
                System.out.print(" ");
            }
            
            //2i-1 is the number of stars on the row. m is a variable in order to make sure this executes properly.
            for(int m = 0; 2*i-1 > m ; m++){
                System.out.print("*");
            }
            
            //Newline
            System.out.println();
        }
    }

}
/*
     *
    ***
   *****
  *******
 *********
***********
*/