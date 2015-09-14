/*
    PROGRAM NAME
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the amount of cultivateable land on Donut Island, which is 4.16 miles in diameter and has a lake in the center of .95 miles in diameter.

    What I learned: Not much aside from the fact that rounding is annoying.
    
    Difficulties: Nothing.
*/

public class DonutIsland {

    public static void main(String[] args) {
        // Constant Declaration because PI won't change.
        final double PI = Math.PI;
        //Island diameters.
        double outerDiameter = 4.16;
        double innerDiameter = 0.95;
        //Island and lake areas
        double areaIsland = PI*Math.pow(outerDiameter, 2);
        double areaLake = PI*Math.pow(innerDiameter, 2);
        double areaLand = areaIsland - areaLake;
        System.out.println("Donut island with a diameter of 4.16 miles that contains a circular lake of .95 miles has " + Math.round(areaLand*100)/100d +  " square miles of cultivatable land.");
        
        //Verified with Wolfram Alpha.
    }

}
/* Sample Output
Donut island with a diameter of 4.16 miles that contains a circular lake of .95 miles has 51.53 square miles of cultivatable land.
*/