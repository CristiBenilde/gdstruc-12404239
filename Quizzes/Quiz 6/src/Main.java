//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    Tree tree = new Tree();

    tree.insert(14);
    tree.insert(7);
    tree.insert(9);
    tree.insert(17);
    tree.insert(20);
    tree.insert(2);
    tree.insert(15);
    tree.insert(10);
    tree.insert(11);
    tree.insert(13);
    tree.insert(-5);
    tree.insert(50);

    System.out.println("\nTraversing the Tree In Ascending Order:\n");
    tree.traverseInOrder();
    System.out.println("\nTraversing the Tree in Descending order:\n");
    tree.traverseInOrderDescending();

    System.out.println("\nGetting the Minimum Value inside the tree:\n\n" + tree.getMin());

    System.out.println("\nGetting the Maximum Value inside the tree:\n\n" + tree.getMax());
}
