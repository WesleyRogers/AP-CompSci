import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InternetTimeDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog602b.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("");
        while(input.hasNextInt()){
            System.out.println(new InternetTime(input.nextInt(), input.nextDouble(), input.nextInt()));
        }
    }

}
