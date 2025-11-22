public class PlayerDoublyLinked
{
    PlayerNode head;
    PlayerNode tail;


    public void addToFront(Player player)
    {
        PlayerNode tempNode = new PlayerNode(player);
        if (head == null)
        {
            head = tempNode;
            tail = tempNode;


        }
        else
        {
            tail.Next = head;
            tempNode.Previous = tempNode;
            head = tempNode;
        }
    }

    public void  addToPosition(Player player, int position)
    {
        PlayerNode tempNode = new PlayerNode(player);
        if (position == 1)
        {
            addToFront(player);
        }
        else
        {
            PlayerNode currentNode = head;
            int currentPosition = 1;

            while (currentNode != null && currentPosition < position)
                {
                currentNode = currentNode.Next;
                currentPosition++;
                }
            if (currentNode == null)
            {
                addToEnd(player);
            }
            else
            {
                tempNode.Next = currentNode;
                tempNode.Previous = currentNode.Previous;
                currentNode.Previous.Next = tempNode;
                currentNode.Previous = tempNode;
            }
        }
    }

    public void addToEnd(Player player)
    {
        PlayerNode tempNode = new PlayerNode(player);
        if (tail == null)
        {
            head = tempNode;
            tail = tempNode;
        }
        else
        {
           tail.Next = tempNode;
           tempNode.Previous = tail;
           tail = tempNode;
        }
    }

    public void removeFromFront()
    {
        if (head == null)
        {
            return;
        }

        if (head == tail)
        {
            head = null;
            tail = null;
        }

        PlayerNode tempNode = head;
        head = head.Next;
        head.Previous = null;
        tempNode.Next = null;
    }

    public void removeFromPosition(int position)
    {
        if (head == null)
        {
            return;
        }

        if (position == 1)
        {
            removeFromFront();
        }

        PlayerNode currentNode = head;
        int currentPosition = 1;

        while (currentNode != null && currentPosition != position)
            {
                currentNode = currentNode.Next;
                currentPosition++;
            }

        if (currentNode == null)
        {
            System.out.println("Invalid");
        }

        if (currentNode == tail)
        {
            removeFromEnd();
        }

        currentNode.Previous.Next = currentNode.Next;
        currentNode.Next.Previous = currentNode.Previous;
        currentNode.Previous = null;
        currentNode.Next = null;
    }

    public void removeFromEnd()
    {
        if (tail == null)
        {
            return;
        }

        if (head == tail)
        {
            head = null;
            tail = null;
        }

        PlayerNode tempNode = tail;
        tail = tail.Previous;
        tail.Next = null;
        tempNode.Previous = null;
    }

    public boolean contains(Player player)
    {
        PlayerNode currentNode = head;
        while (currentNode != null)
        {
            if (currentNode.player == player)
            {
                System.out.println(player + " exists!");
                return true;
            }
            currentNode = currentNode.Next;
        }
        return  false;
    }

    public void printForward()
    {
        PlayerNode current = head;
        System.out.println("HEAD BELOW");
        while (current != null)
        {
            System.out.println(current.getPlayer());
            current = current.Next;
        }
        System.out.println("TAIL END");
    }

    public void printBackward()
    {
        PlayerNode current = tail;
        System.out.println("TAIL BELOW");
        while (current != null)
        {
            System.out.println(current.getPlayer());
            current = current.Previous;
        }
        System.out.println("FRONT END");
    }

    public void tempPrintList()
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
