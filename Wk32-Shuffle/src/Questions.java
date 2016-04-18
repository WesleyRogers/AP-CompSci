import java.util.Random;

/**
 * A class written to hold the responses for Wednesday of Week 32's answers.
 * @author wroge7934
 *
 */
public class Questions {
    
    /**
     * Tests whether or not two arrays are permutations of each other.
     * @param array1    The array to check against.
     * @param array2    The array being checked.
     * @return          A boolean stating whether or not they are permutations of each other.
     */
    public static boolean arePermutations(int[] array1, int[] array2){
        boolean running = true;
        for(int i = 0; i < (array1.length < array2.length? array2.length : array1.length); i++){
            running = running && isMemberInArray(array2, array1[i]); //Check to see if there is a copy of each element in array1 in array2
        }
        return running;
    }
    
    public static boolean isMemberInArray(int[] array, int e){
        for(int i = 0; i<array.length-1; i++){
            if (array[i]==e){
                return true;
            }
        }
        return false;
    }
    
    public static String flip(){
        Random rand = new Random();
        if(rand.nextInt(3)+1 == 3){
            return "heads";
        }
        return "tails";
    }
}
