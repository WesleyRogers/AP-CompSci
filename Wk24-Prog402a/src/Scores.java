import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scores {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = null;
        try {
            input = new Scanner(new File("prog402a.dat"));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        int i = 0;
        int[] ids = new int[21];
        int[] scores = new int[21];
        while(input.hasNextInt()){
            ids[i] = input.nextInt();
            scores[i] = input.nextInt();
            i++;
        }
        
        int sum = sumArray(scores);
        double avg = round(averageArray(scores), 2);
        System.out.println("The sum of the classes scores is: " + sum);
        System.out.println("The average of the classes scores is: " + avg);
        System.out.println("ID  Score Diff");
        for(i = 0; i < ids.length; i++){
            System.out.println(ids[i] + " " + scores[i] + "   " + round(scores[i] - avg, 2));
        }
    }

    //Averages int[] array.
    public static double averageArray(int[] array){ //I really love having a list of all of the methods I've written.
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        double avg = sum / ((double) array.length);
        return avg;
        
    }
    
    public static int sumArray(int[] array){ //Hehe, this is only an except of the above method.
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return sum;
    }
    
    public static double round(double num, int places){
        double rounded = Math.round(num * Math.pow(10, places))/Math.pow(10, places); //Rounds number
        return rounded;
    }
}
