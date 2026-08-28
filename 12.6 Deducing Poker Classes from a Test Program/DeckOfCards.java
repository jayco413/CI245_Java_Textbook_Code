import java.util.ArrayList;

public class DeckOfCards {

    private ArrayList<PlayingCard> cards = new ArrayList<>();

    public DeckOfCards() {
        // intentionally empty -- used with addCard() to build a specific test hand
    }

    public DeckOfCards(boolean fullDeck) {
        // ADD YOUR CODE HERE -- if fullDeck, populate all 52 cards
    }

    public void Shuffle() {
        // ADD YOUR CODE HERE
    }

    public void addCard(PlayingCard card) {
        cards.add(card);
    }

    public ArrayList<PlayingCard> deal(int count) {
        // ADD YOUR CODE HERE
        return null;
    }

    public ArrayList<PlayingCard> getCards() {
        return cards;
    }
}
