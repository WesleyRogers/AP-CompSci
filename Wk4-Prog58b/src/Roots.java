/*
    Program 58b Roots
    Wesley Rogers 
    9/16/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Finds the real roots of a quadratic, and returns NaN if none exist.

    What I learned: Doubles are really, really weird. I tried to add an if/else statement and Apparently 4.0d-4.0d was not returning zero as it should.
    
    Difficulties: Aslide from doubles being weird, nothing.
*/

import java.util.*;

public class Roots {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Quadratic Equation Solver");
        System.out.print("Enter A, B, and C on the same line without and punctuation aside from decimals. ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double determinant = Math.pow(b, 2) - 4*a*c; //The determinant, the thing under the root.
        double bPlus = (-b + Math.sqrt(determinant))/(2*a);
        double bMinus = (-b - Math.sqrt(determinant))/(2*a);
        //Outputing the roots.
        System.out.println("Your roots are: "+ bMinus + " and " + bPlus);
    }

}
/* Sample Output
Quadratic Equation Solver
Enter A, B, and C on the same line without and punctuation aside from decimals. 1.0 2.0 1.0
Your roots are: -1.0 and -1.0

Quadratic Equation Solver
Enter A, B, and C on the same line without and punctuation aside from decimals. 1 2 -1
Your roots are: -2.414213562373095 and 0.41421356237309515

Quadratic Equation Solver
Enter A, B, and C on the same line without and punctuation aside from decimals. 1.5 4.1 -6.5
Your roots are: -3.8568696927493016 and 1.1235363594159684
*/