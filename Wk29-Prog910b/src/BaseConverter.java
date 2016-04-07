import java.util.Scanner;

/*
    Program 910b Base Converter
    Wesley Rogers 
    3/22/16
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Changes the base of a number using recursion, does not however work for negative bases. Bases above 16 can be used if basechars is increased.
    
    What I learned: Base changing is actually easier than I thought it was using recursion, and I knew it was easy.
    
    Difficulties: None.
*/

public class BaseConverter {

    public static final char[] BASECHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int base = 0;
        int num = 0;
        do {
            System.out.print("Enter a number you'd like to have converted or -1 to quit: ");
            num = in.nextInt();
            if (num != -1){
                System.out.print("Enter a base between 2 and 16: ");
                base = in.nextInt();
                if (base >= 2 && base <= 16){
                    System.out.println("Your number is: " + convertBase(num, base) + " in base " + base + "\n");
                } else if(base != -1){
                    System.out.println("Choose a base between 2 and 16!\n");
                }
            }
        } while(num != -1);
    }
    
    public static String convertBase(int num, int base){
        int remainder = 0;
        int newNum = num;
        if (num/base == 0){
            return BASECHARS[num%base]+"";
        } else {
            remainder = num % base;
            newNum -= remainder;
            newNum /= base;
            return convertBase(newNum, base) + "" + BASECHARS[remainder];
        }
        
    }
    
}
/*
Enter a number you'd like to have converted or -1 to quit: 83
Enter a base between 2 and 16: 8
Your number is: 123 in base 8

Enter a number you'd like to have converted or -1 to quit: 255
Enter a base between 2 and 16: 16
Your number is: FF in base 16

Enter a number you'd like to have converted or -1 to quit: 256
Enter a base between 2 and 16: 16
Your number is: 100 in base 16

Enter a number you'd like to have converted or -1 to quit: 100
Enter a base between 2 and 16: 3
Your number is: 10201 in base 3

Enter a number you'd like to have converted or -1 to quit: -1
*/