/*
    Program 166e Decimal Equivalents
    Wesley Rogers 
    10/12/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the values of every fraction with a denominator between integers 2-14 that is less than one.

    What I learned: Formatting is not that hard, just don't screw up and for get an = and waste a half hour.
    
    Difficulties: When rewriting limitStringSize i dropped an equal and the first part was always running, which is not what I wanted.
*/
public class DecimalEquivalents {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 2; i < 15; i++){ //i is the denominator
            for(int k = 1; k < i; k++){ //k is the numerator
                System.out.print(limitStringSize(k + "/" + i , 10, false)); //Print the fraction
                System.out.println(roundWithZeroes( ((double)k / i), 5) ); //Divide k by i as a double, then round to 5 places.
            }
        }
    }
    
    //I rewrote this!
    //Pads or shortens string so that it is always length size.
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
    
    public static String roundWithZeroes(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Copied straight from round(double, int);
        String output = String.format(("%."+ places + "f") , rounded);
        return output;
    }

}
/* Sample Output
1/2       0.50000
1/3       0.33333
2/3       0.66667
1/4       0.25000
2/4       0.50000
3/4       0.75000
1/5       0.20000
2/5       0.40000
3/5       0.60000
4/5       0.80000
1/6       0.16667
2/6       0.33333
3/6       0.50000
4/6       0.66667
5/6       0.83333
1/7       0.14286
2/7       0.28571
3/7       0.42857
4/7       0.57143
5/7       0.71429
6/7       0.85714
1/8       0.12500
2/8       0.25000
3/8       0.37500
4/8       0.50000
5/8       0.62500
6/8       0.75000
7/8       0.87500
1/9       0.11111
2/9       0.22222
3/9       0.33333
4/9       0.44444
5/9       0.55556
6/9       0.66667
7/9       0.77778
8/9       0.88889
1/10      0.10000
2/10      0.20000
3/10      0.30000
4/10      0.40000
5/10      0.50000
6/10      0.60000
7/10      0.70000
8/10      0.80000
9/10      0.90000
1/11      0.09091
2/11      0.18182
3/11      0.27273
4/11      0.36364
5/11      0.45455
6/11      0.54545
7/11      0.63636
8/11      0.72727
9/11      0.81818
10/11     0.90909
1/12      0.08333
2/12      0.16667
3/12      0.25000
4/12      0.33333
5/12      0.41667
6/12      0.50000
7/12      0.58333
8/12      0.66667
9/12      0.75000
10/12     0.83333
11/12     0.91667
1/13      0.07692
2/13      0.15385
3/13      0.23077
4/13      0.30769
5/13      0.38462
6/13      0.46154
7/13      0.53846
8/13      0.61538
9/13      0.69231
10/13     0.76923
11/13     0.84615
12/13     0.92308
1/14      0.07143
2/14      0.14286
3/14      0.21429
4/14      0.28571
5/14      0.35714
6/14      0.42857
7/14      0.50000
8/14      0.57143
9/14      0.64286
10/14     0.71429
11/14     0.78571
12/14     0.85714
13/14     0.92857
*/