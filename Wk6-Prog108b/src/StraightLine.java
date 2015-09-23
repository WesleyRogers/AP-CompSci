/*
    Program 108b Straight Line
    Wesley Rogers 
    9/23/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the straight line depreciation of an object given its price, salvage price, and how long you plan to own it. Works with partial years too!

    What I learned: Arrays are weird because they start at zero, but you initialize them with the number of members you want. It makes sense, but still a tad weird.
    
    Difficulties: The member size of an array was throwing me off for a bit, and I kept misreading the termination in my for loop which was miswritten. Its fixed here. 
*/
import java.util.Scanner;

public class StraightLine {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] depreciation = new double[4]; //This has four members.
        double[] price = new double[4];
        double[] salvage = new double[4];
        double[] years = new double[4];
        
        for(int i=0; i<=3; i++){
            System.out.println("Run #" + (i+1));
            
            
            //Getting input
            System.out.print("What is the price of the item? ");
            price[i] = input.nextDouble();
            
            System.out.print("What is the salvage price of the item? ");
            salvage[i] = input.nextDouble();
            
            System.out.print("How many years will you have it? ");
            years[i] = input.nextDouble();
            
            //The straight line formula for depreciation. Pretty simple. I used arrays because I read it wrong the first time around and already had them there.
            depreciation[i] = (price[i]-salvage[i])/years[i];
            
            System.out.println("Annual depreciation is estimated to be at $" + round(depreciation[i],2) + ".\n");
            
        }
        
    }
    //It is honestly amazing how much this gets used. Like wow.
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places);
        return rounded;
    }
}
/*Sample Output
Run #1
What is the price of the item? 250
What is the salvage price of the item? 35
How many years will you have it? 8
Annual depreciation is estimated to be at $26.88.

Run #2
What is the price of the item? 2425
What is the salvage price of the item? 470
How many years will you have it? 6
Annual depreciation is estimated to be at $325.83.

Run #3
What is the price of the item? 1162
What is the salvage price of the item? 625
How many years will you have it? 5
Annual depreciation is estimated to be at $107.4.

Run #4
What is the price of the item? 9654.33
What is the salvage price of the item? 100
How many years will you have it? 12
Annual depreciation is estimated to be at $796.19.

*/