/*
    Program 58i Monthly Payment
    Wesley Rogers 
    9/18/2015
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives your monthly payment, total interest paid, and the total amount paid on a loan.

    What I learned: Doubles are weird, and rounding is weird.
    
    Difficulties: I was rounding before calculating the total amount paid, was throwing me off by 10c.
*/

import java.util.*;

public class MonthlyPayment {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.println("How much do you wish to borrow?");
        double principle = input.nextDouble();
        
        System.out.println("What is the rate on your loan?");
        double rate = input.nextDouble();
        
        System.out.println("How long will it take you to pay off the loan in years?");
        double years = input.nextDouble();
        
        double rOver = rate/1200d; //Makes the formula stuff much simpler code wise.
        double lastTerm = (Math.pow((1+rOver), (years*12)))/(Math.pow((1+rOver), (years*12))-1);
        double monthlyPayment = principle * rOver * lastTerm;
        
        double totalPaid = monthlyPayment * years * 12; // The total amount paid.
        double interestPaid = totalPaid - principle;
        
        System.out.println("You will pay $"+ round(monthlyPayment, 2) + " as a monthly payment.");
        System.out.println("You will pay $"+ round(interestPaid, 2) + " as interest.");
        System.out.println("You will pay $"+ round(totalPaid, 2) + " in total."); // This one has already been rounded, yay!
        
    }
    //Copied from computing interest.
    public static double round(double num, int places){
        double rounded = Math.floor((num*Math.pow(10, places)) + 0.5)/Math.pow(10, places);
        return rounded;
    }
}
/* Sample Output
How much do you wish to borrow?
7500
What is the rate on your loan?
14.5
How long will it take you to pay off the loan in years?
3
You will pay $258.16 as a monthly payment.
You will pay $1793.66 as interest.
You will pay $9293.66 in total

How much do you wish to borrow?
7500
What is the rate on your loan?
14.5
How long will it take you to pay off the loan in years?
4
You will pay $206.83 as a monthly payment.
You will pay $2428.06 as interest.
You will pay $9928.06 in total.

How much do you wish to borrow?
7500
What is the rate on your loan?
7.5
How long will it take you to pay off the loan in years?
3
You will pay $233.3 as a monthly payment.
You will pay $898.68 as interest.
You will pay $8398.68 in total.
*/