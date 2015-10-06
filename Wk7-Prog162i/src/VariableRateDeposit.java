/*
    Program 162i Variable Rate Deposit
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives you the value of a variable interest Certificate of Deposit using the interest rates for each year and your initial deposit.

    What I learned: Nothing really, wasn't hard.
    
    Difficulties: Nothing.
*/

import java.util.Scanner;

public class VariableRateDeposit {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.println("Enter the amount you deposited.");
        double startMoney = input.nextDouble();
        
        double money = startMoney; //I don't like destroying input data.
        
        //for every int 1-5
        for (int i = 1; i<6; i++){
            System.out.println("Enter the rate for year " + i + ".");
            double rate = input.nextDouble();
            
            //Calculate the interest, then round it so we don't get shenanigans
            double interest = round((rate/100d)*money , 2);
            money = money + interest; //Then add the interest to the money, because interest is money too
            
            System.out.println("You earned $" + interest + " in interest. \n");
            
        }
        System.out.println("Your deposit is now worth $" + money + ".");
    }
    
    //Rounds num to places places
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places);
        return rounded;
    }
}
/* Sample Output
Enter the amount you deposited.
3000
Enter the rate for year 1.
10
You earned $300.0 in interest. 

Enter the rate for year 2.
5
You earned $165.0 in interest. 

Enter the rate for year 3.
7
You earned $242.55 in interest. 

Enter the rate for year 4.
9
You earned $333.68 in interest. 

Enter the rate for year 5.
11
You earned $444.54 in interest. 

Your deposit is now worth $4485.77.
*/