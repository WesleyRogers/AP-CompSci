/*
    Program 213g Linear Equations
    Wesley Rogers 
    11/2/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the solutions of a line given in slope-intercept form.

    What I learned: Not much.
    
    Difficulties: None.
*/
import java.util.Scanner;

public class LinearEquations {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        
        double x = 0; //This won't compile properly unless I initialize it? It never reaches the last if block unless it gets initialized. >.>
        if (a != 0 && b != 0){ //If both are nonzero
            x = -b/a;
        } else if (a != 0 && b == 0){ //If a is nonzero
            x = 0;
        } else if (a == 0 && b == 0){ //If both are nonzero
            System.out.println("There are an infinite number of solutions.");
            System.exit(0); //Stop everything if infinite
        } else if (a == 0 && b != 0){ //If b is nonzero
            System.out.println("There are no solutions.");
            System.exit(0); //Stop everything if no solutions.
        }
        
        
        
        if (b > 0){ //This makes things print pretty with the proper sign.
            System.out.println(a+"x + " + b + " = 0 at x = " + x);
        } else if (b < 0){
            System.out.println(a+"x - " + Math.abs(b) + " = 0 at x = " + x);
        } else if (b == 0){
            System.out.println(a+"x " + " = 0 at x = " + x);
        }
        
    }

}
/*
Enter a: 4
Enter b: -5
4.0x - 5.0 = 0 at x = 1.25

Enter a: 7
Enter b: 12
7.0x + 12.0 = 0 at x = -1.7142857142857142

Enter a: 0
Enter b: 0
There are an infinite number of solutions.

Enter a: 0
Enter b: 7
There are no solutions.

Enter a: 3.5
Enter b: -1.6
3.5x - 1.6 = 0 at x = 0.4571428571428572

Enter a: 159
Enter b: 753
159.0x + 753.0 = 0 at x = -4.735849056603773
*/