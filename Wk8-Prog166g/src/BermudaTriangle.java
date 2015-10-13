import java.util.Scanner;

public class BermudaTriangle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows you would like to have: ");
        int numberRows = input.nextInt();
        
        do {
            System.out.println();
            for(int i = 1; i < (numberRows+1); i++){ //numberRows + 1 because we're starting on 1; i is the number of rows
                
                //To get the first row to look right. I could have done this differently but it was rather late in the program.
                if(i==1){ //c is the column specifically for this loop.
                    for(int c = 1; c < (numberRows+1); c++){
                        System.out.print(limitStringSize(c+"", 4,true));
                    }
                } 
                System.out.println();
                
                for(int k = 1; k <=i; k++){//k is the column for the row that is not the first
                    System.out.print(limitStringSize((i*k)+"", 4, true));
                }
            }
            
            //Starting over
            System.out.print("\nEnter the number of rows you would like to have: ");
            numberRows = input.nextInt();
        } while(numberRows !=0);
        System.out.println("Thank you for using this program!");
        
        //Cleaning things up and exiting cleanly.
        input.close();
        System.exit(0);
        
        
    }
    
    //Pads a string to be the correct length.
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
}
/* Sample Output
Enter the number of rows you would like to have: 4

   1   2   3   4
   1
   2   4
   3   6   9
   4   8  12  16
Enter the number of rows you would like to have: 2

   1   2
   1
   2   4
Enter the number of rows you would like to have: 7

   1   2   3   4   5   6   7
   1
   2   4
   3   6   9
   4   8  12  16
   5  10  15  20  25
   6  12  18  24  30  36
   7  14  21  28  35  42  49
Enter the number of rows you would like to have: 0
Thank you for using this program!

*/