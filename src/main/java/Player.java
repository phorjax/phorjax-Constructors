

public class Player {
    public String playerName;
    public int level;

  
    public Player(String playerName){
        this.playerName = playerName;
        this.level = 1;
    }

  
    public Player(String playerName, int level){
        this.level = level;
        this.playerName = playerName;
    }

}
