import java.util.Scanner;
import java.util.Random;

void main()
{
    PlayerQueue queue = new PlayerQueue(100);
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);

    int PlayerID = 1;
    int GameCount = 0;

    System.out.println("\nMatchmaking Simulation");
    System.out.println("Press Enter to begin.");

    while (GameCount < 10)
    {
        scan.nextLine();

        System.out.println("\nNew Turn!");

        int x = rand.nextInt(7) + 1;
        System.out.println(x + " players queued!");

        for (int i = 0; i < x; i++)
        {
            queue.add("Player" + (PlayerID++));
        }

        System.out.println("Players in queue: " + queue.size());

        if (queue.size() >= 5)
        {
            System.out.println("Starting game " + (GameCount + 1));

            System.out.print("Players matched: ");
            for (int i = 0; i < 5; i++)
            {
                String matchedPlayer = queue.remove();
                System.out.print(matchedPlayer + " ");
            }
            System.out.println("\nPress Enter to continue.");
            GameCount++;
        }

    }

    System.out.println("\nSimulation Complete!");
    System.out.println("10 games successfully created.");
}
