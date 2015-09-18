/*
    Program 54j Racing Cars
    Wesley Rogers 
    9/18/2015
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the difference in time between two magic cars that drive at 70mph around the earth, one on the earth, the other flying 15 feet above it.

    What I learned: Not much, this is a pretty standard physics problem.
    
    Difficulties: Integer division is a royal pain. Urgh.
*/
public class RacingCars {

    public static final double earthRadius = 4000d; //in miles.
    public static final double PI = 3.14159;
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        double earthCircumfrence = 2*PI*earthRadius;
        double blueCarCircumfrence =2*PI*(earthRadius + (15d/5280)); // I HATE INTEGER DIVISION
        
        
        
        double redCarTime = earthCircumfrence/70d; //The red car's time by taking the earth's radius and dividing it by the speed in Mi/h
        double blueCarTime = blueCarCircumfrence/70d; //Getting the Blue car time in hours
        
        double deltaTime = blueCarTime - redCarTime;
        
        System.out.println("The blue car will cross the finish line "+(60*60*deltaTime)+" seconds after the red car.");
    }

}
/* Sample Output
The blue car will cross the finish line 0.9179970779314317 seconds after the red car.
*/