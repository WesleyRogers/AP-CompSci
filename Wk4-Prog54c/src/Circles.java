/*
    Program 54c Circles
    Wesley Rogers 
    September 14, 2015
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Finds the circumfrence and area of a circle using the constant PI.

    What I learned: Not much, I have experience with constants.
    
    Difficulties: Nothing.
*/

public class Circles {

    public static void main(String[] args) {
        // This is the Pi constant, I'm using Math.PI because its pi.
        final double PI = Math.PI;
        //Radius of 3. 
        final double radius = 3.0; // This could be a standard variable, but we don't need to change it mid program.
        
        double circumfrence = radius * 2 * PI; //2pi*radius Circumfrence formula
        double area = PI * Math.pow(radius, 2); //PI * radius^2 Area formula for circle
        
        System.out.println("The radius of the circle is 3."); 
        System.out.println("The circumfrence of the circle is " + ((Math.round(circumfrence*1000))/1000d)); //Rounding to 4 digits. I might move this somewhere else later.
        System.out.println("The area of the circle is " + ((Math.round(area*1000))/1000d)); //So it looks like I'd have to use a BigDecimal to round. Nope. Using this then.
        // Everything was verified by Wolfram Alpha.
    }

}
/* Sample Output
The radius of the circle is 3.
The circumfrence of the circle is 18.85
The area of the circle is 28.274
*/