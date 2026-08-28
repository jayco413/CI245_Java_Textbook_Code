import java.util.ArrayList;
import java.util.Collections;

public class GameOfWar {

    public static void main(String[] args) {
        ArrayList<Integer> cards = new ArrayList<Integer>();

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                cards.add(i + 1);
            }
        }

        Collections.shuffle(cards);

        ArrayList<Integer> player1hand = new ArrayList<Integer>(cards.subList(0, 26));
        ArrayList<Integer> player2hand = new ArrayList<Integer>(cards.subList(26, 52));

        System.out.println("Player 1's Deck");
        printCards(player1hand);
        System.out.println();
        System.out.println("Player 2's Deck");
        printCards(player2hand);
        System.out.println();

        ArrayList<Integer> center = new ArrayList<Integer>();

        while (player1hand.size() > 0 && player2hand.size() > 0) {
            // ADD YOUR CODE HERE -- play one round of War
            break;
        }

        if (player1hand.size() == 0) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Player 1 wins!");
        }
    }

    private static void printCards(ArrayList<Integer> cards) {
        for (int i = 0; i < cards.size(); i++) {
            System.out.printf("%3s", cardString(cards.get(i)));
            if ((i + 1) % 10 == 0 && i != cards.size() - 1) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static String cardString(int i) {
        switch (i) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "K";
        }
        return Integer.toString(i);
    }
}
