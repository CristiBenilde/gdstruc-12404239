import java.util.Objects;

public class Player
{
    private int PlayerID;
    private String PlayerName;
    private int level;

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return PlayerID == player.PlayerID && level == player.level && Objects.equals(PlayerName, player.PlayerName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(PlayerID, PlayerName, level);
    }

    @Override
    public String toString() {
        return "Player{" +
                "PlayerID=" + PlayerID +
                ", PlayerName='" + PlayerName + '\'' +
                ", level=" + level +
                '}';
    }

    public Player(int playerID, String playerName, int level) {
        this.PlayerID = playerID;
        this.PlayerName = playerName;
        this.level = level;
    }

    public int getPlayerID()
    {
        return PlayerID;
    }

    public void setPlayerID(int playerID)
    {
        PlayerID = playerID;
    }

    public String getPlayerName()
    {
        return PlayerName;
    }

    public void setPlayerName(String playerName)
    {
        PlayerName = playerName;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }
}
