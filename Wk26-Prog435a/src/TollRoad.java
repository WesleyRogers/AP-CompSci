import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TollRoad {
    
    public static final String[] vehicleName = {"Compact Car", "Small Car", "Mid Size Car", "Full Size Car", "Truck", "16 Wheeler"};
    public static final double[] vehicleType = {1, 1.3, 1.6, 2.0, 2.4, 2.7};
    public static final double[] gateFee = {1.35, 2, 2.5, 3.25, 4.1, 4.8, 5.5, 6};
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog435a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Car Type      Gate Cost  Vehicle Mult.  Total Cost");
        while(input.hasNextInt()){
            int carType = input.nextInt();
            int gateNo = input.nextInt();
            double tollCost = gateFee[gateNo-1] * vehicleType[carType-1];
            System.out.println(lss(vehicleName[carType-1], 16, false) + "$"+ roundZeros(gateFee[gateNo-1], 2) + "        " +  roundZeros(vehicleType[carType-1], 2) + "         $" + roundZeros(tollCost, 2));
            
        }
        
    }

    public static String lss(String string, int size, boolean isRightPadded){
        String stringOut = string;
        if (isRightPadded == true) {
            stringOut = String.format(("%1$" + size + "s"), string); //Pad it on the right if its short
        } else {
            stringOut = String.format(("%1$-" + size + "s"), string); //Pad it on the left if its short
        }
        stringOut = stringOut.substring(0, size);//Cut it short if its long.
        return stringOut; //Returns the formatted string.
    }
    
    public static String roundZeros(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Round the number
        String output = String.format(("%."+ places + "f") , rounded); //Format the number to places places
        return output;
    }
    
}
/*
Car Type      Gate Cost  Vehicle Mult.  Total Cost
Compact Car     $1.35        1.00         $1.35
Small Car       $2.50        1.30         $3.25
Mid Size Car    $4.10        1.60         $6.56
Full Size Car   $5.50        2.00         $11.00
Truck           $2.00        2.40         $4.80
16 Wheeler      $3.25        2.70         $8.78
Compact Car     $4.80        1.00         $4.80
Small Car       $6.00        1.30         $7.80
Mid Size Car    $1.35        1.60         $2.16
Full Size Car   $2.50        2.00         $5.00
Truck           $4.10        2.40         $9.84
16 Wheeler      $5.50        2.70         $14.85
Compact Car     $6.00        1.00         $6.00
Small Car       $1.35        1.30         $1.76
Mid Size Car    $2.00        1.60         $3.20
Full Size Car   $2.50        2.00         $5.00
Truck           $3.25        2.40         $7.80
16 Wheeler      $4.10        2.70         $11.07
*/