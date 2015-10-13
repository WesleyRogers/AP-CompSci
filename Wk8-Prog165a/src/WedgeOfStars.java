/*
    Program 165a Wedge of stars
    Wesley Rogers 
    10/13/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives a downward facing pyramid of stars given a base width.

    What I learned: Nothing really.
    
    Difficulties: None.
*/
import java.util.Scanner;

public class WedgeOfStars {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input the number of stars you would like to use : ");
        int stars= input.nextInt();
        for(int i = stars; i > 0; i--){ //Start i as the number of stars, then decrement by one each time.
            for (int k = 0; k < i; k++){ //Start k as 0, then increment until as large as i
                System.out.print("*");
            }
            System.out.println(); //New line character, because required.
        }
        input.close();
    }

}
/*
Input the number of stars you would like to use : 7
*******
******
*****
****
***
**
*

Input the number of stars you would like to use : 4
****
***
**
*

Input the number of stars you would like to use : 5
*****
****
***
**
*

*/