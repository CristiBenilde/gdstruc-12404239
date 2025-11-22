public class PlayerLinkedList
{

    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNext(head);
        head = playerNode;
    }

    public void removeFromFront()
    {
        head = head.getNext();
    }

    public void printList()
    {
        PlayerNode current = head;
        System.out.println("HEAD BELOW");
        while (current != null)
        {
            System.out.println(current.getPlayer());
            current = current.getNext();
        }
        System.out.println("NULL");
    }

}
