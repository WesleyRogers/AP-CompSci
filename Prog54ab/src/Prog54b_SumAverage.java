/*
    Wesley Rogers
    Franklinton High School
    Program 54b Sum and Average
  
    Sums and averages some numbers. 

    First try ran properly, so no issues.

    I really cannot type is what I have learned. So many spelling mistakes in the comments when I first wrote them.
*/
public class Prog54b_SumAverage {

    public static void main(String[] args) {
        // Declarations, since they're hardcoded numbers lets just call them letters.
        int a = 475;
        int b = 821;
        int c = 369;
        int d = 562;
        
        int sum = a+b+c+d;
        double average = (double) sum / 4;
        System.out.println("Thank you for entering your four numbers! Your results are: \nThe sum of the four numbers is " + sum
                + " and the average is " + average); // Eclipse was having a small fit here because the line was so long.
    }

}
/* Sample Output
Thank you for entering your four numbers! Your results are: 
The sum of the four numbers is 2227 and the average is 556.75
*/