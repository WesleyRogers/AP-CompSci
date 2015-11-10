/*
    Program 230b Ulam's Hypothesis
    Wesley Rogers 
    11/3/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Shows ulam's hypothesis for the first 25 positive integers.

    What I learned: I learned how to use the ?: operator So I could condense line 22 from ~5 lines to one! :D
    
    Difficulties: Getting the while loop to return the value of one was weird until I added the or operand in. It worked fine, it just didn't return anything for one because 1==1.
*/

public class UlamsHypothesis {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 1; i<=25; i++){
            int ulam = i;
            System.out.print(i+": ");
            boolean isOne = i==1 ? true : false; //If i is one, isOne is true, else false. I wanted shorthand for this.
            while (ulam != 1 || isOne){
                if(ulam%2 == 1){
                    ulam = 3*ulam + 1;
                    isOne = false; //This stops an infinite loop.
                } else if (ulam % 2 == 0){
                    ulam /= 2;
                }
                System.out.print(ulam + " ");
            }
            System.out.println();
        }
    }

}
/* Sample Output
1: 4 2 1 
2: 1 
3: 10 5 16 8 4 2 1 
4: 2 1 
5: 16 8 4 2 1 
6: 3 10 5 16 8 4 2 1 
7: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
8: 4 2 1 
9: 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
10: 5 16 8 4 2 1 
11: 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
12: 6 3 10 5 16 8 4 2 1 
13: 40 20 10 5 16 8 4 2 1 
14: 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
15: 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
16: 8 4 2 1 
17: 52 26 13 40 20 10 5 16 8 4 2 1 
18: 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
19: 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
20: 10 5 16 8 4 2 1 
21: 64 32 16 8 4 2 1 
22: 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
23: 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 
24: 12 6 3 10 5 16 8 4 2 1 
25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
*/