import java.util.Scanner;

import us.magicalash.apcs.wk21.DigitExtractor;

public class DigitDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.println("Select an option: \n1)Units \n2)Tens \n3)Hundreds \n4)Thousands \n5)Quit"); //A touch harder to read but much more compact. 
        
        boolean cont = true;
        while(cont){
            System.out.print("Choose an option: ");
            int option = input.nextInt();
            
            DigitExtractor d = null; //This is so it doesn't call for input before exiting.
            
            switch (option){ //I like my case statements indented.
                case 1: d = new DigitExtractor(input); d.printDigitFromPos(1); break;
                case 2: d = new DigitExtractor(input); d.printDigitFromPos(2); break;
                case 3: d = new DigitExtractor(input); d.printDigitFromPos(3); break;
                case 4: d = new DigitExtractor(input); d.printDigitFromPos(4); break;
                case 5: cont = false; break;
                default: System.out.println("That is not a proper option. You must choose!");
            }
            System.out.println("Bye!");
        }
    }

}
