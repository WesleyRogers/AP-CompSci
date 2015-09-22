/*
    PROGRAM NAME
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    DESCRIPTION

    What I learned: 
    
    Difficulties:
*/
import java.util.Scanner;

public class RoadTrip {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many miles do you plan on driving one way? ");
        double miles = input.nextDouble();
        
        System.out.print("Whats the estimated cost of gas for your trip? ");
        double gasPrice = input.nextDouble();
        
        System.out.print("What is the MPG of your car? ");
        double mpg = input.nextDouble();
        
        double totalCost = (miles / mpg) * gasPrice;
        System.out.println("The cost of traveling " + miles + " miles at " + mpg + " MPG with gas averaging at $" + gasPrice + " per gallon is $" + round(totalCost,2) + ".");
    }
    
    //Honestly its amazing how much I'm using this snippet
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places);
        return rounded;
    }
}
/* Sample Output
How many miles do you plan on driving one way? 2974.12
Whats the estimated cost of gas for your trip? 1.719
What is the MPG of your car? 30
The cost of traveling 2974.12 miles at 30.0 MPG with gas averaging at $1.719 per gallon is $170.42.
*/