//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    Player bluey = new Player(1, "Bluey", 24);
    Player ready = new Player(2, "Ready", 25);
    Player carl = new Player(3, "Carl", 3);
    Player pen = new Player(4, "Pen", 10);
    Player senna = new Player(5, "Senna", 21);
    Player veyron = new Player(6, "Bugatti_VeyronFan", 53);
    Player aston = new Player(7,"Aston_Machan",1);
    Player galaxy = new Player(8,"GalaxyMan2026",34);
    Player starry = new Player(9,"StarryNights",62);
    Player oguri = new Player(10,"Oguri_Cap",100);


    SimpleHashTable hashTable = new SimpleHashTable();
    hashTable.put(bluey.getPlayerName(),  bluey);
    hashTable.put(ready.getPlayerName(), ready);
    hashTable.put(carl.getPlayerName(), carl);
    hashTable.put(pen.getPlayerName(), pen);
    hashTable.put(senna.getPlayerName(), senna);
    hashTable.put(veyron.getPlayerName(), veyron);
    hashTable.put(aston.getPlayerName(), aston);
    hashTable.put(galaxy.getPlayerName(), galaxy);
    hashTable.put(starry.getPlayerName(), starry);
    hashTable.put(oguri.getPlayerName(), oguri);

    System.out.println("Printing Hash Table:\n");

    hashTable.printHashTable();

    System.out.println("\nGetting a specific element on the Hash Table\nGetting: Aston_Machan\n");

    System.out.println(hashTable.get("Aston_Machan"));

    System.out.println("\nRemoving that specific element earlier on the Hash Table:\n");

    hashTable.remove("Aston_Machan");
    hashTable.printHashTable();
}
