/*
    Program 122a
    Wesley Rogers 
    9/24/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Takes the numbers 1-40 inclusive and gives their squares and square roots (Rounded to 6 decimal places)

    What I learned: Formatting is hard. I managed to get all of the code working on the first try, the formatting took a bit.
    
    Difficulties: Not much, but I find it weird that I have to concatenate an empty string to a number rather than being able to just cast it. It makes sense, still annoying.
*/
public class SquareSquared {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Number  Squared Square Root");
        for(int i=1; i<41; i++){
            String justI = ""+i; //Turning i into a string
            String iSquared = ""+Math.pow(i, 2); // If this was a math course this would be -1
            String rootI = ""+Math.sqrt(i); //square rooting i
            
            System.out.println(limitStringSize(justI,8) + limitStringSize(iSquared,8) + limitStringSize(rootI,8)); //The limitStringSizes are so that the formatting looks nice.
        }
    }
    
    //Oh my god! It worked first try! This is so getting used elsewhere!
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
Number  Squared Square Root
1       1.0     1.0     
2       4.0     1.414213
3       9.0     1.732050
4       16.0    2.0     
5       25.0    2.236067
6       36.0    2.449489
7       49.0    2.645751
8       64.0    2.828427
9       81.0    3.0     
10      100.0   3.162277
11      121.0   3.316624
12      144.0   3.464101
13      169.0   3.605551
14      196.0   3.741657
15      225.0   3.872983
16      256.0   4.0     
17      289.0   4.123105
18      324.0   4.242640
19      361.0   4.358898
20      400.0   4.472135
21      441.0   4.582575
22      484.0   4.690415
23      529.0   4.795831
24      576.0   4.898979
25      625.0   5.0     
26      676.0   5.099019
27      729.0   5.196152
28      784.0   5.291502
29      841.0   5.385164
30      900.0   5.477225
31      961.0   5.567764
32      1024.0  5.656854
33      1089.0  5.744562
34      1156.0  5.830951
35      1225.0  5.916079
36      1296.0  6.0     
37      1369.0  6.082762
38      1444.0  6.164414
39      1521.0  6.244997
40      1600.0  6.324555
*/