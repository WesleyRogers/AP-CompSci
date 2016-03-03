import java.util.Scanner;

import us.magicalash.apcs.wk22.Mathey;

/*
    Week 22 Mathey Stuff
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Tests out each of the methods in the Mathey class.
    
    What I learned: Not much, although I did learn the isNaN method of the Double class.
    
    Difficulties:
*/
public class MatheyStuff {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers.");
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        System.out.print("dy/dx = " + Mathey.deriveTerm(a, 3) + " + "+ Mathey.deriveTerm(b, 2) + " + " + Mathey.deriveTerm(c, 1) + " which has solutions at: ");
        
        double aP = new Scanner(Mathey.deriveTerm(a, 3).replaceAll("x\\^", " ")).nextDouble(); //a prime
        double bP = new Scanner(Mathey.deriveTerm(b, 2).replaceAll("x\\^", " ")).nextDouble(); //b prime
        double cP = new Scanner(Mathey.deriveTerm(c, 1).replaceAll("x\\^", " ")).nextDouble(); //c prime
        
        double x1 = Mathey.quadraticMinus(aP, bP, cP);
        double x2 = Mathey.quadraticPlus(aP, bP, cP);
        
        if (Double.isNaN(x1)){
            System.out.println("Try some different numbers!");
            System.exit(1); //Input does not have a valid root.
        }
        
        
        long bigX = (long) (x1* 100000 * 100000); //Multiply a number by 10000000000,
        int randomDigit = Mathey.getDigitFromPos((int) bigX, (int) (Math.random()*10)); //Take a random digit,
        int factorial = (int) Mathey.factorial(randomDigit); //This won't cause any screw ups, as 9! is less than 2^31-1.
        boolean prime = Mathey.isPrime(factorial - 1) || Mathey.isPrime(factorial + 1);
        
        System.out.println("\nx= " + x1 + " and  x= " + x2);
        System.out.println("Take the first root, and multiply it by 10000000000! " + bigX);
        System.out.println("Then take a random digit... " + randomDigit);
        System.out.println("Factorial it! " + factorial);
        System.out.println("Is it a factorial prime? (+- 1 is a prime number) " + prime);
    }

}
/*
Enter three integers.
1
2
-12
dy/dx = 3x^2 + 4x^1 + -12x^0 which has solutions at: 
x= -2.7748517734455866 and  x= 1.441518440112253
Take the first root, and multiply it by 10000000000! -27748517734
Then take a random digit... 8
Factorial it! 40320
Is it a factorial prime? (+- 1 is a prime number) false

Enter three integers.
1
2
3
dy/dx = 3x^2 + 4x^1 + 3x^0 which has solutions at: Try some different numbers!

*/