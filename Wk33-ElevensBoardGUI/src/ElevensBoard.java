import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS =
		{"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS =
		{"spades", "hearts", "diamonds", "clubs"};

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES =
		{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;


	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	 public ElevensBoard() {
	 	super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	 }

	/**
	 * Determines if the selected cards form a valid group for removal.
	 * In Elevens, the legal groups are (1) a pair of non-face cards
	 * whose values add to 11, and (2) a group of three cards consisting of
	 * a jack, a queen, and a king in some order.
	 * @param selectedCards the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal;
	 *         false otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		if(selectedCards.size() > 3){
		    return false;
		} else if(selectedCards.size() == 2){
		    
		    return containsPairSum11(selectedCards);
		} else if(selectedCards.size() == 3){
		    
		    return containsJQK(selectedCards);
		}
		
		
		return false;
	}

	/**
	 * Determine if there are any legal plays left on the board.
	 * In Elevens, there is a legal play if the board contains
	 * (1) a pair of non-face cards whose values add to 11, or (2) a group
	 * of three cards consisting of a jack, a queen, and a king in some order.
	 * @return true if there is a legal play left on the board;
	 *         false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		Integer[] vals = {0,1,2,3,4,5,6,7,8};
		
		return containsJQK(Arrays.asList(vals)) || containsPairSum11(Arrays.asList(vals));
	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find an 11-pair.
	 * @return true if the board entries in selectedCards
	 *              contain an 11-pair; false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
	    Integer[] nums = selectedCards.toArray(new Integer[selectedCards.size()]);
	    int index = 0;
	    
	    for(Integer i : nums){
	        Card currentCard = super.cardAt(i);
	        if(currentCard != null){
    	        for(Integer k : nums){ //Yes, this is right. Since the set 2*Z does not contain 11, we can check every card to see if it works.
    	            Card checkedCard = super.cardAt(k);
    	            if(checkedCard != null && currentCard.pointValue() + checkedCard.pointValue() == 11){
    	                System.out.println(currentCard);
    	                System.out.println(checkedCard + "\n");
    	                return true;
    	            }
    	        }
	        }
	        
	    }
	    
	    
	    
	    return false;
	}

	/**
	 * Check for a JQK in the selected cards.
	 * @param selectedCards selects a subset of this board.  It is list
	 *                      of indexes into this board that are searched
	 *                      to find a JQK group.
	 * @return true if the board entries in selectedCards
	 *              include a jack, a queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
	    boolean hasKing = false;
        boolean hasQueen = false;
        boolean hasJack = false;
        Integer[] nums = selectedCards.toArray(new Integer[selectedCards.size()]);
        for(Integer i : nums){
            Card currentCard = super.cardAt(i);
            if(currentCard!=null){ //I really need to be better about null checking.
                if(currentCard.rank().equals("king")){
                    hasKing = true;
                }
                
                if(currentCard.rank().equals("queen")){
                    hasQueen = true;
                }
                
                if(currentCard.rank().equals("jack")){
                    hasJack = true;
                }
            }
        }
        
        return hasKing && hasQueen && hasJack;
	}
}
