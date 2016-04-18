import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */

/*
    Week 32 Shuffling
    Wesley Rogers 
    DATE
    Java 1.8u25, using Eclipse Mars
    Windows 7
    
    Contains two shuffling algorithms.
    
    What I learned: Not much, but I learned that you cannot use array1 = array2 and expect it to hold outside of the method.
    
    Difficulties:
*/
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call
	 * to each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 4;


	/**
	 * Tests shuffling methods.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive perfect shuffles:");
		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT +
								 " consecutive efficient selection shuffles:");
		int[] values2 = {0, 1, 2, 3};
		for (int j 
		        = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}


	/**
	 * Apply a "perfect shuffle" to the argument.
	 * The perfect shuffle algorithm splits the deck in half, then interleaves
	 * the cards in one half with the cards in the other.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
	    int lastEvenIndex = values.length % 2 == 1 ? values.length - 1 : values.length - 2; // Is the length odd? If it is, the last index is even other wise it's odd.
		int[] shuffled = new int[values.length];
	    for(int i = 0, k = 0; i < values.length; i++){ //I condensed this into one loop, yay. The other way would remove the if statement and have a second loop.
		    shuffled[i] = values[k];
		    
		    if(k == lastEvenIndex){
		        k = 1;
		    } else {
		        k +=2;
		    }
		}
	    
	    
	    for(int i = 0; i < shuffled.length; i++){
	        values[i] = shuffled[i];
	    }
	}

	/**
	 * Apply an "efficient selection shuffle" to the argument.
	 * The selection shuffle algorithm conceptually maintains two sequences
	 * of cards: the selected cards (initially empty) and the not-yet-selected
	 * cards (initially the entire deck). It repeatedly does the following until
	 * all cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards.
	 * An efficient version of this algorithm makes use of arrays to avoid
	 * searching for an as-yet-unselected card.
	 * @param values is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		int[] shuffled = new int[values.length];
		for (int i = values.length - 1; i > 0; i--){
		    Random rand = new Random();
		    int swapPos = rand.nextInt(i+1); //i+1 because inclusive is required.
		    swapArrayElements(values, swapPos, i);
		}
		
	}
	
    /**
     * Swaps an array's elements.
     * @param array The array to have elements swapped.
     * @param i     The first index to swap.
     * @param k     The second index to swap.
     */
    public static void swapArrayElements(int[] array, int i, int k){
        int temp = array[i];
        array[i] = array[k];
        array[k] = temp;
    }
    
}
/*
Results of 4 consecutive perfect shuffles:
  1: 0 2 1 3
  2: 0 1 2 3
  3: 0 2 1 3
  4: 0 1 2 3

Results of 4 consecutive efficient selection shuffles:
  1: 0 2 3 1
  2: 1 3 2 0
  3: 1 3 0 2
  4: 0 3 1 2

*/