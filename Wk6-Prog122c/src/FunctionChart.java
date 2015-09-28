/*
    Program 122c Function Chart
    Wesley Rogers 
    9/24/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you a chart with the even values for the functions x, x+1, 2x, and x^2.

    What I learned: Not much, just reinforcement.
    
    Difficulties: Nothing.
*/

public class FunctionChart {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 2; i < 12; i+=2){
            //Column 1's equation is just i
            //Column 2's is n+1
            //Column 3's is 2n
            //Column 4's is n^2
            
            //Variable declaration
            int columnOne = i;
            int columnTwo =(i+1);
            int columnThree = (2*i);
            int columnFour =(i*i); //This remains an int, so no roundoff errors!
            
            //Output. If the actual members of the matrix mattered you could use a 2d array. The limitStringSize is so that formatting works correctly.
            System.out.println(limitStringSize(columnOne+"",4) + limitStringSize(columnTwo+"",4) + limitStringSize(columnThree+"",4) + limitStringSize(columnFour+"",4));
            
            
        }
    }
    
    //Takes string string and lengthens it to length 'size'.
    public static String limitStringSize(String string, int size){
        String stringOut = string;
        //So long as the string's length is not equal to the wanted size;
        for(int i=0; stringOut.length()!=(size); i++){
            //If the string is too short, add a space
            if (stringOut.length() < size){
                stringOut = stringOut + " ";
            } else if (string.length() > size) { //If its too large, cut off the last character.
                stringOut = stringOut.substring(0, (stringOut.length() - 1));
            } //If its just the right length, skip both!
        }
        return stringOut; //Returns the formatted string.
    }
}
/* Sample Output
2   3   4   4   
4   5   8   16  
6   7   12  36  
8   9   16  64  
10  11  20  100 
*/