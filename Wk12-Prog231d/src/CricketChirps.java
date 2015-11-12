/*
    Program 231d Chirping Crickets
    Wesley Rogers 
    11/12/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the temperature outside by inputing the number of times a cricket has chirped in the past minute.

    What I learned: Not much, although I had forgot this trick.
    
    Difficulties: None.
*/
import java.util.Scanner;

public class CricketChirps {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of times a cricket chirped in the past minute: ");
        int chirps = input.nextInt();
        double tempInF = (chirps + 40)/4;
        double tempInC = (tempInF-32)*(5.0/9);
        
        System.out.println("Temperature in F: " + tempInF);
        System.out.println("Temperature in C: " + tempInC);
        
        if(tempInF < 80){
            if(tempInF < 45){
                System.out.println("The cricket says \"Brrrrrrr-rrr!\"");
            } else if (tempInF < 65){
                System.out.println("The cricket says \"Take a jacket!\"");
            } else {
                System.out.println("The cricket says \"Ahhhhhh...\"");
            }
        } else {
            if (tempInF > 109){
                System.out.println("I think the cricket's dead...");
            } else {
                System.out.println("The cricket says \"Whew!\"");
            }
        }
        
        
    }

}
/*
Enter the number of times a cricket chirped in the past minute: 20
Temperature in F: 15.0
Temperature in C: -9.444444444444445
The cricket says "Brrrrrrr-rrr!"

Enter the number of times a cricket chirped in the past minute: 180
Temperature in F: 55.0
Temperature in C: 12.777777777777779
The cricket says "Take a jacket!"

Enter the number of times a cricket chirped in the past minute: 240
Temperature in F: 70.0
Temperature in C: 21.11111111111111
The cricket says "Ahhhhhh..."

Enter the number of times a cricket chirped in the past minute: 480
Temperature in F: 130.0
Temperature in C: 54.44444444444445
I think the cricket's dead...
*/