public class PlayerNode
{
    public Player player;
    PlayerNode Next;
    PlayerNode Previous;

    public PlayerNode(Player player)
    {
        this.player = player;
        this.Previous = null;
        this.Next = null;
    }

    public Player getPlayer()
    {
        return player;
    }

    public void setPlayer(Player player)
    {
        this.player = player;
    }

    public PlayerNode getNext() {
        return Next;
    }

    public void setNext(PlayerNode next) {
        Next = next;
    }

    public PlayerNode getPrevious() {
        return Previous;
    }

    public void setPrevious(PlayerNode previous) {
        Previous = previous;
    }
}
