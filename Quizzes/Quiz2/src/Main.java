//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{

    Player Gadget = new  Player(1,"Gadget",40);
    Player Broadway = new Player(2,"Broadway",65);
    Player Beef = new Player(3,"Beef",100);


    PlayerDoublyLinked playerDoublyLinked = new PlayerDoublyLinked();

    playerDoublyLinked.addToFront(Gadget);
    playerDoublyLinked.addToPosition(Broadway, 2);
    playerDoublyLinked.addToEnd(Beef);

    System.out.println("\nDoubly Linked List Test\n\nPrinting Forwards:");

    playerDoublyLinked.printForward();

    System.out.println("\nPrinting Backwards:");
    playerDoublyLinked.printBackward();


    System.out.println("\nAdding 3 new nodes:");
    Player David = new Player(10,"David",12);
    Player Voidless = new Player(16,"Voidless",50);
    Player Blouser = new Player(18,"Blouser",2);

    playerDoublyLinked.addToEnd(David);
    playerDoublyLinked.addToEnd(Voidless);
    playerDoublyLinked.addToEnd(Blouser);

    playerDoublyLinked.printForward();


    System.out.println("\nHead Node Deletion:");

    playerDoublyLinked.removeFromFront();
    playerDoublyLinked.printForward();

    System.out.println("\nTail Node Deletion:");
    playerDoublyLinked.removeFromEnd();
    playerDoublyLinked.printForward();

    System.out.println("\nContains Test:");

    System.out.println("\nChecking if Broadway Exists:");
    playerDoublyLinked.contains(Broadway);


}
