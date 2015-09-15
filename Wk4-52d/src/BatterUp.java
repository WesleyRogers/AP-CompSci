/*
    Program 52d Batter Up
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    DESCRIPTION

    What I learned: 
    
    Difficulties:
*/
import java.util.*;

public class BatterUp {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter player's name.");
        String name = scanner.next();
        
        System.out.println("Enter the number of times at base.");
        int atBase = scanner.nextInt();
        
        System.out.println("Enter the number of hits.");
        int runs = scanner.nextInt();
        
        System.out.println("Enter the number of walks.");
        int walks = scanner.nextInt();
        
        double avgDenominator = atBase - walks;
        double battingAvg = runs / avgDenominator; // This seems totally off BUT its what the document says and I know nothing of baseball.
        
        double onBase = (runs+walks)/((double) atBase);//On Base percentage
        
        System.out.println("Player's Name: "+name);
        System.out.println("Player's number of times at bat: "+ atBase);
        System.out.println("Player's number of hits: "+runs);
        System.out.println("Player's number of walks: "+walks);
        System.out.println("Player's Batting Average:"+round(battingAvg,4));
        System.out.println("Player's On Base percentage: "+ round(onBase,4));
        
    }
    static double round(double num, int decimal) { //Java y u no haz rounding to a decimal
        double out = Math.round(num * Math.pow(10, decimal))/Math.pow(10,decimal);
        
        return out;
        
    }

}
