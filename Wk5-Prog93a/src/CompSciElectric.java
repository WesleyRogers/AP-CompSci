/*
    Program 93a CompSci Electric
    Wesley Rogers 
    9/21/2015
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you your CompSci Electric bill given how many KWH used.

    What I learned: Rounding is important.
    
    Difficulties: I wasn't rounding in the variables and I was off by a cent in the total cost and total late cost variables
*/
import java.util.Scanner;

public class CompSciElectric {
    
    public static final double surcharge = 0.1;
    public static final double taxRate = 0.03;
    public static final double kwhPrice = 0.0475; // Dollars/KWH
    public static final double lateRate  = 1.04; // Only if you're late.
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of Kilowatt-hours used: ");
        double kwhUsed = input.nextInt();
        
        double baseCharge = round((kwhUsed * kwhPrice),2);
        double cityTax = round((baseCharge * taxRate),2);
        double surchargeCost = round((surcharge * baseCharge),2);
        double totalCost = round((baseCharge + cityTax + surchargeCost),2);
        double lateCost = totalCost * lateRate;
        
        System.out.println("C O M P S C I Electric");
        System.out.println("----------------------------------");
        System.out.println("You used "+ kwhUsed + " kilowatt-Hours.");
        System.out.println("----------------------------------");
        System.out.println("Base Charge:         $" + round(baseCharge,2));
        System.out.println("Surcharge:           $" + round(surchargeCost,2));
        System.out.println("City Tax:            $" + round(cityTax,2));
        System.out.println("Total Cost:          $" + round(totalCost,2));
        System.out.println("Late Cost:           $" + round(lateCost,2));
    }
    //Its amazing how much this gets used.
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places);
        return rounded;
    }
}
/* Sample Output

Enter the number of Kilowatt-hours used: 993
C O M P S C I Electric
----------------------------------
You used 993 kilowatt-Hours.
----------------------------------
Base Charge:         $47.17
Surcharge:           $4.72
City Tax:            $1.42
Total Cost:          $53.31
Late Cost:           $55.44

*/