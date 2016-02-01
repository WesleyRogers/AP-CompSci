package us.magicalash.apcs.wk22;

public class Mathey {
    private Mathey(){} //This is an aditional library, not a class. No instantiating!
    
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
    
    
}
