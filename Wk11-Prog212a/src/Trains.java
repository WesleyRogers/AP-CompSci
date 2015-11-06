/*
    Program 212a Trains
    Wesley Rogers 
    11/6/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives when two trains should pass assuming one is moving at 50 mi/h

    What I learned: Not much, physics problem.
    
    Difficulties: None.
*/
import java.util.Scanner;

public class Trains {

    public static void main(String[] args) {
        boolean shouldContinue = true;
        Scanner input = new Scanner(System.in);
        int freightSpeed = 50;
        int freightDist = 0;
        int passSpeed;
        int passDist = 0;
        int time = 9;
        int hourBefore;
        boolean isPassengerMoving = false;
        boolean isAm = true;
        boolean isAmBefore;
        boolean ran = false;
        
        while(shouldContinue){
            
            
            System.out.print("How fast does the passenger train travel? ");
            passSpeed = input.nextInt();
            System.out.println("The freight train is moving at 50mi/h.");
            System.out.println("The passenger train is moving at " + passSpeed + "mi/h.");
            
            
            //These are so the loop runs.
            time++;
            freightDist += freightSpeed;
            while(passDist < freightDist && passSpeed > freightSpeed){ //passSpeed must be larger than freightSpeed or infinite loop.
                freightDist += freightSpeed;
     
                if(time == 11){ //Probably not the most efficient way of doing this, but it works.
                    isPassengerMoving = true;
                }
                
                if(isPassengerMoving){
                passDist += passSpeed;
                }
                
                if (time == 12){
                    time = 0;
                    isAm = !isAm; //Swap the Am modifier every time is reaches 12.
                }
                time++;
                ran = true;
            }
            
            if(passDist == freightDist && ran){
                System.out.println("The trains met at " + time + (isAm? "Am\n" : "Pm\n")); //isAm? Is a conditional to return am or pm depending on whether it is am or pm
            } else if (passDist > freightDist){
                if(time == 1){
                    hourBefore = 12;
                    isAmBefore = isAm;
                }else if(time == 12){
                    hourBefore = time - 1;
                    isAmBefore = isAm;
                } else{
                    hourBefore = time - 1;
                    isAmBefore = isAm;
                }
                
                System.out.println("The trains passed between " + hourBefore + (isAmBefore? "Am" : "Pm") + " and " + time + (isAm? "Am.\n" : "Pm.\n"));
                
                
                
            } else {
                System.out.println("The trains will not pass. \n");
            }
            
            if(passSpeed == 0){
                System.out.println("Goodbye.");
                shouldContinue = false;
            }
            
            
        }
        
        
    }

}
/*
How fast does the passenger train travel? 75
The freight train is moving at 50mi/h.
The passenger train is moving at 75mi/h.
The trains met at 3Pm

How fast does the passenger train travel? 80
The freight train is moving at 50mi/h.
The passenger train is moving at 80mi/h.
The trains passed between 5Pm and 6Pm.

How fast does the passenger train travel? 85
The freight train is moving at 50mi/h.
The passenger train is moving at 85mi/h.
The trains passed between 8Pm and 9Pm.

How fast does the passenger train travel? 40
The freight train is moving at 50mi/h.
The passenger train is moving at 40mi/h.
The trains will not pass. 

How fast does the passenger train travel? 0
The freight train is moving at 50mi/h.
The passenger train is moving at 0mi/h.
The trains will not pass. 

Goodbye.
*/