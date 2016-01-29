package us.magicalash.apcs.wk21;

import java.util.Scanner;

public class DigitExtractor {
    private int num;
    private Scanner input;
    
    public DigitExtractor(Scanner input){ //Pass the scanner, saves a bit of ram.
        System.out.print("Choose a number: ");
        this.input = input;
        this.num = input.nextInt();
    }
    
    public int getDigitFromPos(int pos){ //This is in no way the best way to write this, but it works.
        if (num < Math.pow(10, pos-1)){ //If the number has less digits than the position, return 0
            return 0;
        }
        
        double tenpow = Math.pow(10, pos-1);
        double numD = num;
        double d1 = Math.floor(numD / tenpow);
        d1 = (d1/10) - Math.floor(d1/10);
        d1 *=10;

        return (int) DigitExtractor.round(d1,0); //Round because roundoff errors
        
    }
    
    public void printDigitFromPos(int pos){
        System.out.println(this.getDigitFromPos(pos));
    }
    
    
    private static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Rounds number
        return rounded;
    }
}
