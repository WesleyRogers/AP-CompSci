import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BoxOfficeDriver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog605a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BoxOffice bo = new BoxOffice();
        String letter = "";
        
        for(char c : input.nextLine().toCharArray()){
            switch (c){
            case 'p': case 'P': bo.display(); break;
            case 'y': case 'Y': bo.hasActivityTicket(); break;
            case 'n': case 'N': bo.noActivityTicket(); break;
            default: System.out.println("The input file appears to have an invalid character.");
            }
        }
    }

}
/*
Revenue: 40
Students: 16

Revenue: 55
Students: 22

Revenue: 70
Students: 28

Revenue: 80
Students: 32

Revenue: 120
Students: 48
*/