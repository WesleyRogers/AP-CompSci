/*
    Program 673a Star Triangles
    Wesley Rogers 
    12/14/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives a triangle of stars that is center, left, or right bound.

    What I learned: Not much, almost all of the code was stuff I've done before. Thank the lord for reusable code.
    
    Difficulties: None.
*/
import java.util.Scanner;

public class StarTriangle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like a (1) left-bound, (2) right-bound, or (3) center-bound triangle? ");
        int choice = input.nextInt();
        switch (choice){
            case 1:{
                leftTriangle(input);
                break;
            }
            case 2:{
                rightTriangle(input);
                break;
            }
            case 3:{
                centerTriangle(input);
                break;
            }
                
        }
    }
    public static void rightTriangle(Scanner input){
        System.out.print("How many rows would you like? ");
        int rows = input.nextInt();
        
        for(int i = 1; i<= rows; i++){
            String line = "";
            for(int k = 0; k<getStars(i, false); k++){
                line += "*";
            }
            System.out.println(limitStringSize(line, rows, true));
            
        }
    }
    
    public static void leftTriangle(Scanner input){
        System.out.print("How many rows would you like? ");
        int rows = input.nextInt();
        
        for(int i = 1; i<= rows; i++){
            String line = "";
            for(int k = 0; k<getStars(i, false); k++){
                line += "*";
            }
            System.out.println(limitStringSize(line, rows, false));
            
        }
    }
    
    public static void centerTriangle(Scanner input){
        System.out.print("How many rows would you like? ");
        int rows = input.nextInt();
        
        for(int i = 1; i<rows+1; i++){ //i is the row
            for(int k = 0; k<=(rows-i); k++){ //Getting the spaces together.
                System.out.print(" ");
            }
            
            for(int m = 0; 2*i-1 > m ; m++){
                System.out.print("*");
            }
            
            //Newline
            System.out.println();
        }
    }
    
    public static int getStars(int row, boolean isCenter){
        return isCenter? 2*row-1:row;
    }
    
    public static String limitStringSize(String string, int size, boolean isRightPadded){
        String stringOut = string;
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
}
/*
Would you like a (1) left-bound, (2) right-bound, or (3) center-bound triangle? 1
How many rows would you like? 3
*  
** 
***

Would you like a (1) left-bound, (2) right-bound, or (3) center-bound triangle? 2
How many rows would you like? 6
     *
    **
   ***
  ****
 *****
******

Would you like a (1) left-bound, (2) right-bound, or (3) center-bound triangle? 3
How many rows would you like? 4
    *
   ***
  *****
 *******
*/