/*
    Program 213b Mass Ordering
    Wesley Rogers 
    11/10/15
    Java 1.8u25, using Eclipse Mars
    Windows 7

    Gives the total price and individual price of an item being mass purchased.

    What I learned: Not much aside from divide and conquer
    
    Difficulties: None.
*/
import java.util.Scanner;

public class QuantityOrdering {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("How many of the item would you like to buy? ");
        int totalBought = input.nextInt();
        int price; //Expressed as cents, because accuracy. Doubles are bad for money.
        
        if (totalBought < 200){
            if (totalBought < 100){
                price = 795;
            } else{
             price = 775;   
            }
        } else {
            if (totalBought < 300){
                price = 740;
            } else {
                price = 715;
            }
        }
         System.out.println("Your price will be: " + (price/100.0));
         System.out.println("Your total cost will be: " + (price * totalBought)/100.0);
        
        
        
    }

}
/*
How many of the item would you like to buy? 50
Your price will be: 7.95
Your total cost will be: 397.5

How many of the item would you like to buy? 199
Your price will be: 7.75
Your total cost will be: 1542.25

How many of the item would you like to buy? 200
Your price will be: 7.4
Your total cost will be: 1480.0

How many of the item would you like to buy? 475
Your price will be: 7.15
Your total cost will be: 3396.25

How many of the item would you like to buy? 0
Your price will be: 7.95
Your total cost will be: 0.0

How many of the item would you like to buy? 1000000
Your price will be: 7.15
Your total cost will be: 7150000.0
*/