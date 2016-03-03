
public class Game {
    private char compThrow;
    private boolean playerWins; //Does the person win?
    private char playerThrow;
    private String playerName;
    
    
    public void makeCompThrow() {
        switch ((int) (Math.random() * 3)) {
            case 0: this.compThrow = 'r'; System.out.println("The computer rolls: Rock!"); break;
            case 1: this.compThrow = 'p'; System.out.println("The computer rolls: Paper!"); break;
            case 2: this.compThrow = 's'; System.out.println("The computer rolls: Scissors!"); break;
        }
    }
    
    
    public char getCompThrow(){
        return compThrow;
    }
    
    public void announceWinner(String playerName, char playerThrow) {
        if ((playerThrow == 'r' && compThrow == 'p') || 
                (playerThrow == 'p' && compThrow == 's') || 
                (playerThrow == 's' && compThrow == 'r')){
            System.out.println("The Computer wins!");
        } else if (playerThrow == compThrow){
            System.out.println("There's a tie! Nobody wins!");
        } else {
            System.out.println(playerName + " wins!");
        }
    }
}
