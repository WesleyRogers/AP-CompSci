/*
    Program 168h Crossing X's
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Makes a 21*21 X made out of x's.

    What I learned: Not much, I did learn that using the outer loop's variable isn't always as useful in the nested loops when I had the right most section of the X filled in.
    
    Difficulties: Not much aside from accidentally filling in a section of the x
*/
public class CrossingX {

    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] line = new char[21]; //This is the entire line! Yay!
        for (int i = 0; i <21; i++){// i is the line
            for(int k = 0; k<21; k++){ //k is the character in the line, reset the entire thing to spaces.
                line[k] = ' ';
            }
            line[i]='x'; //The line number is one of the characters that needs to be an x
            line[20-i] = 'x'; //And the the number that adds with i to be 20
            
            System.out.println(line);
        }
    }

}
/*Sample Output
x                   x
 x                 x 
  x               x  
   x             x   
    x           x    
     x         x     
      x       x      
       x     x       
        x   x        
         x x         
          x          
         x x         
        x   x        
       x     x       
      x       x      
     x         x     
    x           x    
   x             x   
  x               x  
 x                 x 
x                   x

*/