/*
    Progrma 152a Big Sum
    Wesley Rogers 
    9/25/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the sum from x=1 to 3223 of the equation 3x. If I had sigma notation I'd use that but Eclipse doesn't have LaTeX.

    What I learned: Nothing, I learned this in Math III.
    
    Difficulties: Nothing. 
*/

public class BigSum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Initialize sum with a value of zero so things don't go wonky.
        int sum = 0;
        
        //While i is less than 3224, add 3*i to sum.
        for (int i = 1; i<3224; i+=1){
            sum += 3*i;
        }
        //Output
        System.out.println("The sum of all numbers between 0 and 3223 following the form 3x is " + sum + ".");
    }

}
/* Sample Output
The sum of all numbers between 0 and 3223 following the form 3x is 15586428.
*/