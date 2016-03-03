package us.magicalash.apcs.wk22;

/**
 * A small library for some simple math calculations.
 * @author Wesley Rogers
 *
 */
public class Mathey { //Most of this is ported from my calculator or older programs.
    private Mathey(){} //This is an aditional library, not a class. No instantiating! If I remember right, the actual Math class does this. Cool!
    
    /**
     * Gives the factorial of @param num. Equivalent to (num!) in mathematics terms.
     * @param   num  The number that the factorial is applied to.
     * @return  the factorial of the number.
     */
    public static long factorial(int num){
        int i = 1;
        long product = 1; //Long because factorials get VERY big VERY fast
        
        do {
            product = product * i; //Multiply the product by the next number up that is less than or equal to itself
            i++; //Increment i
        } while(i <= num);
        
        return product;
    }
    
    /**
     * Gives the solution to the quadratic equation where the plus/minus is plus.
     * @param a  The coefficient of the x^2 term.
     * @param b  The coefficient of the x term.
     * @param c  The y-intercept.
     * @return   one of two solutions to this quadratic or NaN if a solution does not exist.
     */
    public static double quadraticPlus(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4*a*c;
        
        if (discriminant<0){return Double.NaN;}
        
        return (-b + Math.sqrt(discriminant))/(2*a);
    }
    
    /**
     * Gives the solution to the quadratic equation where the plus/minus is plus.
     * @param a  The coefficient of the x^2 term.
     * @param b  The coefficient of the x term.
     * @param c  The y-intercept.
     * @return   one of two solutions to this quadratic or NaN if a solution does not exist.
     */
    public static double quadraticPlus(int a, int b, int c){
        double discriminant = Math.pow(b, 2) - 4*a*c;
        
        if (discriminant<0){return Double.NaN;}
        
        return (-b + Math.sqrt(discriminant))/(2*a);
    }
    
    /**
     * Gives the solution to the quadratic equation where the plus/minus is minus.
     * @param a  The coefficient of the x^2 term.
     * @param b  The coefficient of the x term.
     * @param c  The y-intercept.
     * @return   one of two solutions to this quadratic or NaN if a solution does not exist.
     */
    public static double quadraticMinus(double a, double b, double c){
        double discriminant = Math.pow(b, 2) - 4*a*c;
        
        if (discriminant<0){return Double.NaN;}
        
        return (-b - Math.sqrt(discriminant))/(2*a);
    }
    
    /**
     * Gives the solution to the quadratic equation where the plus/minus is minus.
     * @param a  The coefficient of the x^2 term.
     * @param b  The coefficient of the x term.
     * @param c  The y-intercept.
     * @return   one of two solutions to this quadratic or NaN if a solution does not exist.
     */
    public static double quadraticMinus(int a, int b, int c){
        double discriminant = Math.pow(b, 2) - 4*a*c;
        
        if (discriminant<0){return Double.NaN;}
        
        return (-b - Math.sqrt(discriminant))/(2*a);
    }
    
    /**
     * Gives the derivative of a term of a function where the term is in the form of coeff*x^degree.
     * @param coeff   The coefficient of the term.
     * @param degree  The degree of the term.
     * @return        the derivative of the term.
     */
    public static String deriveTerm(double coeff, double degree){
        return (coeff*degree) + "x^" + (degree - 1);
    }
    
    /**
     * Gives the derivative of a term of a function where the term is in the form of coeff*x^degree.
     * @param coeff   The coefficient of the term.
     * @param degree  The degree of the term.
     * @return        the derivative of the term.
     */
    public static String deriveTerm(int coeff, int degree){
        return (coeff*degree) + "x^" + (degree - 1);
    }
    
    /**
     * Gets the digit in position pos from integer num.
     * @param num  The number to get the digit from.
     * @param pos  The position to get the number from.
     * @return     the digit in the position provided.
     */
    public static int getDigitFromPos(int num, int pos){ //This is in no way the best way to write this, but it works.
        if (Math.signum(num) == -1.0){ //I did not foresee this being a problem. Huh.
            return getDigitFromPos(Math.abs(num), pos);
        }
        
        if (num < Math.pow(10, pos-1)){ //If the number has less digits than the position, return 0
            return 0;
        }
        
        double tenpow = Math.pow(10, pos-1);
        double numD = num;
        double d1 = Math.floor(numD / tenpow);
        d1 = (d1/10) - Math.floor(d1/10);
        d1 *=10;

        return (int) Mathey.round(d1,0); //Round because roundoff errors
    }
    
    /**
     * Rounds the number provided to places places.
     * @param num    The number to be rounded.
     * @param places The amount of places to round to.
     * @return       the rounded number.
     */
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Rounds number
        return rounded;
    }
    
    /**
     * Determines a number's primality.
     * @param num  The number to check for primality.
     * @return     whether or not the number is prime.
     */
    public static boolean isPrime(long num){ //This is extremely inefficient. Good lordy.
        if (num == 2){
            return true;
        }
        
        if(num % 2 == 0){ //If num is a multiple of 2, go away.
            return false;
        }

        for(int i = 3; i < num; i+=2){ //Check every other number less than num to see if it is a divisor, because we already got rid of even numbers.
            if ((num+0.0)/i == Math.floor((num+0.0)/i)){
                return false;
            }
        }
        
        return true;
    }
}
