import java.util.ArrayList;

public class PokerHand {

    private ArrayList<PlayingCard> cards = new ArrayList<>();

    public void addCards(ArrayList<PlayingCard> newCards) {
        cards.addAll(newCards);
    }

    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

    public String getPokerHandName() {
        // ADD YOUR CODE HERE -- classify this 5-card hand (Royal Flush, Straight
        // Flush, Four of a Kind, Full House, Flush, Straight, Three of a Kind,
        // Two Pair, Pair, or High Card)
        return null;
    }
}
