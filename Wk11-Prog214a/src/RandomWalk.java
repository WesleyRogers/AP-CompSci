/*
    Program 214a Random Walk
    Wesley Rogers 
    11/2/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Focres a man to walk off of a 7ft long bridge that he's standing in the middle of.

    What I learned: Not much, but I did find it kinda cool how the constant on line 32 was really close to the square root of the average, even if it gets changed around.
    
    Difficulties: I forgot to make avg in the method a double rather than an int and I was getting some rather strange numbers. Once I fixed it everything made sense.
*/
import java.util.Random;

public class RandomWalk {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double[] avgSteps = new double[20]; //I am doing 20 runs, so 20 elements.
        double[] maxSteps = new double[20];
        Random num = new Random();
        
        System.out.println("Run #     Avg       Max Steps");
        
        for (int i = 0; i<20; i++){ //i is run # 
            int[] runSteps = new int[1000];
            for (int k = 0; k<1000; k++){ //Actual step simulation done 1k times.
                int distance = 0; //The distance from the starting point.
                int steps = 0;
                //Walking portion.
                while (Math.abs(distance) < 4){ //When the person reaches the edge which is 3.5 feet from him, stop. Also, the average appears to be the square of the constant. Weird.
                    int randNum = num.nextInt(2);
                    if (randNum == 0){
                        distance--; //Decrement by one
                        steps++;
                    } else {
                        distance++; //increment by one
                        steps++;
                    }
                }
                
                //If the steps he took this time is larger than the last recorded largest in the run, overwrite it.
                if (steps > maxSteps[i]){
                    maxSteps[i] = steps;
                }
                //Write how many steps he took into an array. This also overwrites everything regardless, so I don't need to clear it.
                runSteps[k] = steps;
                
            }
            avgSteps[i] = averageArray(runSteps); //Average the array runSteps
            System.out.println(limitStringSize("Run #" + (i+1), 10, false) + limitStringSize(avgSteps[i] + "", 10, false) + limitStringSize(maxSteps[i]+"",10,false));
            
            
        }
    }
    
    //Averages an array of any length.
    public static double averageArray(int[] array){
        int sum = 0;
        for (int num : array){ //For every num in array, add it to sum.
            sum += num;
        }
        double avg = (double) sum / array.length;
        return avg;
        
    }
    
    //Fixes a string to a length with proper padding.
    public static String limitStringSize(String string, int size, boolean isRightPadded){
        String stringOut = string;
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
}
/* Sample Output
Run #     Avg       Max Steps
Run #1    16.72     98.0      
Run #2    16.264    86.0      
Run #3    15.538    76.0      
Run #4    15.744    108.0     
Run #5    16.36     104.0     
Run #6    16.324    82.0      
Run #7    15.498    82.0      
Run #8    16.092    82.0      
Run #9    15.564    124.0     
Run #10   15.946    126.0     
Run #11   15.866    104.0     
Run #12   17.004    102.0     
Run #13   15.752    100.0     
Run #14   16.408    92.0      
Run #15   15.914    84.0      
Run #16   15.746    108.0     
Run #17   15.416    72.0      
Run #18   15.532    94.0      
Run #19   16.364    90.0      
Run #20   16.464    116.0     
*/