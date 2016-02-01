public class Player {
    private double spendingMoney;
    private String prizesWon = ""; //I added = "" so it wouldn't append 'null' to the end of everything.
    /**
    * constructor
    * pre: none
    * post: A Player object created Spending money given to
    * player. The prizes won set to none.
    */
    public Player(double money)
    {
        spendingMoney = money;
    }
    
    /**
    * Player pays for and then plays a game.
    * pre: none
    * post: Player's spending money decreased by cost of game.
    * The player has a new prize added to existing prizes.
    */
    public String play(GameBooth game)
    {
        String newPrize;
        if (game.getCost() > spendingMoney)
            return ( "Sorry, not enough money to play.");
        else
        {
            spendingMoney -= game.getCost () ; //pay for game
            newPrize = game.start (); //play game
            prizesWon = newPrize +" "+ prizesWon;
            return ("prize won: " + newPrize);
        }
    }
    /**
    * Returns the list of prizes won.
    * pre: none
    * post: The list of prizes has been returned. */
    public String showPrizes()
    {
        return (prizesWon);
    }

    @Override
    public String toString(){
        return "I have $" + this.spendingMoney + " left and have won: " + prizesWon + ".";
    }
    
    
    
}
