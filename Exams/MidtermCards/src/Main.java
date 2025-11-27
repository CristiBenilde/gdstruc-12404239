import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Random random = new Random();
    CardStack deck = new CardStack(30);

    for (int i = 0; i < 30; i++)
    {
        deck.push(new Cards("Card" + (i % 10)));
    }

    CardStack discard = new CardStack(30);

    ArrayList<Cards> hand = new ArrayList<Cards>();

    System.out.println("Game Start!");

    while (!deck.isEmpty())
    {

        int command = random.nextInt(3); // 0,1,2
        int x = random.nextInt(5) + 1;   // 1–5

        System.out.println("\n--- New Turn ---");

        if (command == 0) {
            System.out.println("Command: DRAW " + x + " cards");

            for (int i = 0; i < x; i++) {
                Cards drawn = deck.pop();
                if (drawn != null) {
                    hand.add(drawn);
                } else {
                    break;
                }
            }

        } else if (command == 1) {
            System.out.println("Command: DISCARD " + x + " cards");

            for (int i = 0; i < x && !hand.isEmpty(); i++) {
                Cards removed = hand.remove(hand.size() - 1);
                discard.push(removed);
            }
        } else {
            System.out.println("Command: GET " + x + " cards from discard");

            for (int i = 0; i < x; i++) {
                Cards returned = discard.pop();
                if (returned != null) {
                    hand.add(returned);
                } else {
                    break;
                }
            }

            System.out.println("Hand:" + hand);
            System.out.println("Cards left in deck: " + deck.size());
            System.out.println("Discard pile size: " + discard.size());
        }
    }

    System.out.println("\nGame Over! Deck is empty.");

}
