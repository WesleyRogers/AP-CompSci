/*
    Program 123a Formatted Numbers
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you a 5x5 matrix full of integers.

    What I learned: Loops make things really, really small.
    
    Difficulties: Nothing, formatting took a sec as I had to right-bound it.
*/
public class NumberMatrix {

    public static void main(String[] args) {
        // For integers 1-25;
        for (int i=1; i < 26; i++){
            //Print an integer, then add some spaces so its a string with length 5
            System.out.print(limitStringSize(i+"", 5));
            
            if (i%5==0){ //If the number is a multiple of 5;
                System.out.print("\n\n");
            }
        }
    }
    
    //Takes string string and lengthens it to length 'size'.
    public static String limitStringSize(String string, int size){
        String stringOut = string;
        //So long as the string's length is not equal to the wanted size;
        for(int i=0; stringOut.length()!=(size); i++){
            //If the string is too short, add a space
            if (stringOut.length() < size){
                stringOut = " " + stringOut;
            } else if (string.length() > size) { //If its too large, cut off the last character.
                stringOut = stringOut.substring(0, (stringOut.length() - 1));
            } //If its just the right length, skip both!
        }
        return stringOut; //Returns the formatted string.
    }

}
