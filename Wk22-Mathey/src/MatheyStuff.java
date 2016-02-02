import java.util.Random;
import java.util.Scanner;

import us.magicalash.apcs.wk22.Mathey;

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
        
        long bigX = (long) (x1* 100000 * 100000);
        int randomDigit = Mathey.getDigitFromPos((int) bigX, (int) (Math.random()*10));
        long factorial = Mathey.factorial(randomDigit);
        boolean prime = Mathey.isPrime(factorial - 1) || Mathey.isPrime(factorial + 1);
        
        System.out.println("\nx= " + x1 + " and  x= " + x2);
        System.out.println("Take the first root, and multiply it by 10000000000! " + bigX);
        System.out.println("Then take a random digit... " + randomDigit);
        System.out.println("Factorial it! " + factorial);
        System.out.println("Is it a factorial prime? (+- 1 is a prime number) " + prime);
    }

}
