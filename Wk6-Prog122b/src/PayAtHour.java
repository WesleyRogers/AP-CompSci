/*
    Program 122b Hourly Pay
    Wesley Rogers 
    9/24/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives hourly pay at $4/hour for the first 40 hours of your work week.

    What I learned: Not much, but I had forgotten how short loops can make stuff. 
    
    Difficulties: Nothing. The entire program compiled correctly the first time, formatting and all!
*/
public class PayAtHour {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hours Pay");
        
        //While i is less than or equal to 40;
        for(int i=1; i<=40; i++){
            int pay = 4*i; // since there is no cents, multiplying by 4 as an int is ok, and int*int always results in an int.
            
            //These are strings because formatting.
            String sHours = ""+i;
            String sPay = ""+pay;
            
            System.out.println(limitStringSize(sHours, 6) + sPay); //Output
            
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
/*
Hours Pay
1     4
2     8
3     12
4     16
5     20
6     24
7     28
8     32
9     36
10    40
11    44
12    48
13    52
14    56
15    60
16    64
17    68
18    72
19    76
20    80
21    84
22    88
23    92
24    96
25    100
26    104
27    108
28    112
29    116
30    120
31    124
32    128
33    132
34    136
35    140
36    144
37    148
38    152
39    156
40    160
*/