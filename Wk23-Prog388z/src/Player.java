
public class Player {
    private String playerName;
    private char playerThrow;
    
    public Player(String name){
        playerName = name;
    }
    
    public void makeThrow(char rps){
        this.playerThrow = rps;
    }
    
    public char getThrow(){
        return playerThrow;
    }
    
    public String getName(){
        return playerName;
    }
}
