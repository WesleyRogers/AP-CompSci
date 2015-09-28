
public class FunctionTablesTwo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // There are tables for the number, square, square root, cube, and 4th root.
        System.out.println(" Numbers       Squares  Square Roots      Cubes   4th Roots");
        for (int i = 1; i <21; i++){
            int number = i;
            int square = i*i;
            double rootNum = Math.sqrt(i);
            int cube = i*i*i;
            double fourRoot = Math.pow(i, 0.25d);
            
            System.out.println( limitStringSize(number+"",8)+ "      " + limitStringSize(square+"",8) + "        " + limitStringSize(round(rootNum,4)+"",6) + "   " + limitStringSize(cube+"",8) + "      " + limitStringSize(round(fourRoot,4)+"",6));
        }
    }
    
    //Modified to be Right bound
    //shortens or lengthens string to size size
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
    
    //Rounds num to places places
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places);
        return rounded;
    }
}
/*Sample Output
 Numbers       Squares  Square Roots      Cubes   4th Roots
       1             1           1.0          1         1.0
       2             4        1.4142          8      1.1892
       3             9        1.7321         27      1.3161
       4            16           2.0         64      1.4142
       5            25        2.2361        125      1.4953
       6            36        2.4495        216      1.5651
       7            49        2.6458        343      1.6266
       8            64        2.8284        512      1.6818
       9            81           3.0        729      1.7321
      10           100        3.1623       1000      1.7783
      11           121        3.3166       1331      1.8212
      12           144        3.4641       1728      1.8612
      13           169        3.6056       2197      1.8988
      14           196        3.7417       2744      1.9343
      15           225         3.873       3375       1.968
      16           256           4.0       4096         2.0
      17           289        4.1231       4913      2.0305
      18           324        4.2426       5832      2.0598
      19           361        4.3589       6859      2.0878
      20           400        4.4721       8000      2.1147
*/