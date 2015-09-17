/*
    PROGRAM NAME
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    A program that finds interest given a time, a rate, and an initial amount. Had this in any setting other than this class I would have used a BigDecimal here.

    What I learned: I cannot read. 
    
    Difficulties:
*/
import java.util.*;

public class ComputingInterest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);        
        
        System.out.println("How much money will you be investing?");
        double principle = input.nextDouble();
        
        System.out.println("What is your interest rate?");
        double rate = input.nextDouble();
        
        System.out.println("How many times per year is your investment compounded?");
        int compounded = input.nextInt(); //This should make the multiplication a bit easier and more accurate.
        
        System.out.println("How many days will this investment be at interest?");
        int days = input.nextInt();
        
        double interestFactor = (0.01 * rate)/compounded;
        double exponent = (compounded * days)/365d; //Integer divisionnnnn
        double inAccount = principle * (Math.pow((1+interestFactor),exponent));
        double interest = inAccount-principle;
        
        System.out.println("You will earn $"+round(interest,2)+" in interest.");
        System.out.println("There is will be $"+round(inAccount,2)+" at the end of your investment.");
    }
    //I could includ a Javadoc statement here, but its not really needed. Rounds num to places places.
    public static double round(double num, int places){
        double rounded = Math.floor((num*Math.pow(10, places)) + 0.5)/Math.pow(10, places);
        return rounded;

    }
}
/* Sample Output
How much money will you be investing?
5000
What is your interest rate?
11.5
How many times per year is your investment compounded?
365
How many days will this investment be at interest?
900
You will earn $1638.96 in interest.
There is will be $6638.96 at the end of your investment.

How much money will you be investing?
10000
What is your interest rate?
16.5
How many times per year is your investment compounded?
365
How many days will this investment be at interest?
90
You will earn $415.14 in interest.
There is will be $10415.14 at the end of your investment.

How much money will you be investing?
1500
What is your interest rate?
8.5
How many times per year is your investment compounded?
365
How many days will this investment be at interest?
365
You will earn $133.06 in interest.
There is will be $1633.06 at the end of your investment.
*/