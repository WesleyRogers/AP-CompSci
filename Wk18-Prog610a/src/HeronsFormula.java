import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import us.magicalash.apcs.prog610a.Triangle;
/*
    Program 610a Heron's Formula
    Wesley Rogers 
    1/6/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Gives the area of a triangle using a class.
    
    What I learned: Some times it's way easier to write the code with out OOP them force it into an object. Not the best practise, but I unintentionally did it here.
    
    Difficulties: None, but the class was kinda un-neccesarry.
*/
public class HeronsFormula {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("Prog610a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("A    B    C    Area");
        
        do{
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            Triangle t = new Triangle(a,b,c);
            System.out.print(limitStringSize(t.a+"", 5, false) + limitStringSize(b+"", 5, false) + limitStringSize(c+"", 5, false));
            if (t.area() == -1){
                System.out.println("This is not a triangle! What am I supposed to do with these!?"); 
            } else {
                System.out.println(t.area());
            }
        } while(input.hasNextLine());
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
A    B    C    Area
3    4    5    6.0
3    4    50   This is not a triangle! What am I supposed to do with these!?
7    8    9    26.832815729997478
9    9    12   40.24922359499622
6    5    21   This is not a triangle! What am I supposed to do with these!?
24   7    25   84.0
13   12   5    30.0
50   40   30   600.0
10   10   10   43.30127018922193
82   34   48   This is not a triangle! What am I supposed to do with these!?
4    5    6    9.921567416492215
*/