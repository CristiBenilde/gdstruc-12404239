public class PlayerQueue
{
    private String[] queue;
    private int front;
    private int rear;
    private int size;

    public PlayerQueue(int capacity)
    {
        queue = new String[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void add(String player)
    {
        if (size == queue.length)
        {
            System.out.println("Queue is full!");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = player;
        size++;
    }

    public String remove()
    {
        if(isEmpty())
        {
            return null;
        }

        String player = queue[front];
        front = (front + 1) % queue.length ;
        size--;

        return player;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int size()
    {
        return size;
    }

    public String[] getQueue()
    {
        return queue;
    }

    public void setQueue(String[] queue)
    {
        this.queue = queue;
    }
}
