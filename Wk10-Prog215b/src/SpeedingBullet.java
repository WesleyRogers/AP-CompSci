/*
    Program 215b Faster than a speeding bullet
    Wesley Rogers 
    10/26/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Calculates the maximum height of a bullet fired with an initial velocity of 960ft/s. 

    What I learned: Not much, standard physics/calculus problem.
    
    Difficulties: None.
*/
public class SpeedingBullet {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double height;
        double previousHeight = 0;
        for(int t = 0; t <= 60; t++){ //t is the time in seconds
            height = (960*t)-(16*Math.pow(t, 2)); //The height at t seconds
            if (height < previousHeight){
                System.out.println("The bullet reaches a maximum of 14400 ft. after " + (t-1) + " seconds.");
                System.exit(0); // Exit the program before the loop ends.
            }
            previousHeight = height; // The height of the second before, so we know when its velocity is zero.
        }
    }

}
/* Sample Output
The bullet reaches a maximum of 14400 ft. after 30 seconds.
*/