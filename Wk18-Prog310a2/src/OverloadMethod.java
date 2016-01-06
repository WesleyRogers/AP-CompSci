import java.util.Scanner;
import us.magicalash.apcs.prog310a2.HistogramBar; //I actually own this domain, so this is actually my package.

/*
    Program 310a2 Histogram Bars
    Wesley Rogers 
    1/4/16
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Creates a histogram bar given a number using the HistogramBar

    What I learned: Not much, although I did get to make my own class. Yay!

    Difficulties: None, but for some reason my mind went to overriding (@Override) rather than Overloading when I first saw the weeks assignments
*/

public class OverloadMethod {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        char character;
        boolean shouldContinue;
        
            System.out.print("Enter a number to give the histogram bar. ");
            HistogramBar bar = new HistogramBar(input.nextDouble()); //Instantiate HistogramBar. Yay!
            
            System.out.print("Would you like to supply a character? (y/n)");
            
            if(shouldContinue(input.next())){
                System.out.print("Enter a character to use for the bar. ");
                character = input.next().toCharArray()[0]; //This is the first character of the string. It looks dumb, but it works.
                bar.printBar(character);
            } else {
                bar.printBar();
                //System.out.println(bar.getBar(character)); //Does the same as above, just wordier.
            }
             
            

    }

    //This is really used to determine if the input is yes/y/true
    public static boolean shouldContinue(String s){
        boolean output; //So it doesn't do funny stuff
        if (s.equals("y") || s.toLowerCase().equals("yes") || s.equals("true")){ //String's equals method checks to see if to strings have the same characters.
            output = true; //if input is y, yes or true, continue.
        } else {
            output = false; //stop if not.
        }
        
        return output;
    }
}
/*
Enter a number to give the histogram bar. 13.5
Would you like to supply a character? (y/n)n
************** 13.5

Enter a number to give the histogram bar. 3.2
Would you like to supply a character? (y/n)y
Enter a character to use for the bar. $
$$$ 3.2

Enter a number to give the histogram bar. 16.1
Would you like to supply a character? (y/n)y
Enter a character to use for the bar. @
@@@@@@@@@@@@@@@@ 16.1

Enter a number to give the histogram bar. 0
Would you like to supply a character? (y/n)n
 0.0

Enter a number to give the histogram bar. 12.7
Would you like to supply a character? (y/n)y
Enter a character to use for the bar. !
!!!!!!!!!!!!! 12.7

Enter a number to give the histogram bar. 25
Would you like to supply a character? (y/n)y
Enter a character to use for the bar. .
......................... 25.0

Enter a number to give the histogram bar. 9
Would you like to supply a character? (y/n)y
Enter a character to use for the bar. ()
((((((((( 9.0

*/
