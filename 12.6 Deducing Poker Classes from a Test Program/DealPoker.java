import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DealPoker {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            DeckOfCards deck = new DeckOfCards();
            deck.Shuffle();
            stackDeckForTest(deck, i);
            PokerHand player1Hand = new PokerHand();
            player1Hand.addCards(deck.deal(5));
            printHand("Player", player1Hand);
            System.out.println("Remaining Cards: " + deck.getCards().size());
            System.out.println();
        }

        DeckOfCards deck = new DeckOfCards(true);
        deck.Shuffle();
        PokerHand randomHand1 = new PokerHand();
        PokerHand randomHand2 = new PokerHand();
        randomHand1.addCards(deck.deal(5));
        randomHand2.addCards(deck.deal(5));
        printHand("Random Player 1", randomHand1);
        printHand("Random Player 2", randomHand2);
        System.out.println("Remaining Cards: " + deck.getCards().size());
        System.out.println();
    }

    private static void printHand(String name, PokerHand hand) {
        System.out.print(name + "'s hand: ");
        for (PlayingCard pc : hand.getCards()) {
            System.out.print(pc.toString() + " ");
        }
        System.out.println();
        System.out.println(name + " has a " + hand.getPokerHandName());
    }

    private static void stackDeckForTest(DeckOfCards deck, int testCase) {

        ArrayList<String> suits = new ArrayList<>(Arrays.asList("H", "D", "S", "C"));
        ArrayList<String> ranks =
            new ArrayList<>(Arrays.asList(
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"));

        switch (testCase) {
            case 0: // Royal Flush
            getRandomRoyalFlush(deck, suits);
            break;
            case 1: // Straight Flush
            getRandomStraightFlush(deck, suits, ranks);
            break;
            case 2: // Four of a Kind
            getRandomFourOfAKind(deck, suits, ranks);
            break;
            case 3: // Full House
            getRandomFullHouse(deck, suits, ranks);
            break;
            case 4: // Flush
            getRandomFlush(deck, suits, ranks);
            break;
            case 5: // Straight
            getRandomStraight(deck, suits, ranks);
            break;
            case 6: // Three of a Kind
            getRandomThreeOfAKind(deck, suits, ranks);
            break;
            case 7: // Two Pair
            getRandomTwoPair(deck, suits, ranks);
            break;
            case 8: // Pair
            getRandomPair(deck, suits, ranks);
            break;
            case 9: // High Card
            getRandomHighCard(deck, suits, ranks);
            break;
        }

        deck.Shuffle();
    }

    // True if these five ranks form a run. An Ace plays low as well as high, so
    // A-2-3-4-5 counts, and so does 10-J-Q-K-A.
    private static boolean isFiveInSequence(List<String> hand) {
        List<String> order = Arrays.asList(
            "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A");
        ArrayList<Integer> values = new ArrayList<>();
        for (String rank : hand) {
            values.add(order.indexOf(rank));
        }
        Collections.sort(values);
        if (values.equals(Arrays.asList(0, 1, 2, 3, 12))) {
            return true; // A-2-3-4-5
        }
        return values.get(4) - values.get(0) == 4;
    }

    // Five independently chosen suits, guaranteed not to be all the same suit.
    private static ArrayList<String> pickMixedSuits(ArrayList<String> suits) {
        ArrayList<String> chosen = new ArrayList<>();
        do {
            chosen.clear();
            for (int i = 0; i < 5; i++) {
                Collections.shuffle(suits);
                chosen.add(suits.get(0));
            }
        } while (chosen.get(0).equals(chosen.get(1))
            && chosen.get(0).equals(chosen.get(2))
            && chosen.get(0).equals(chosen.get(3))
            && chosen.get(0).equals(chosen.get(4)));
        return chosen;
    }

    private static void getRandomHighCard(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        do {
            Collections.shuffle(ranks);
        } while (isFiveInSequence(ranks.subList(0, 5)));

        String oddCard1 = ranks.get(0);
        String oddCard2 = ranks.get(1);
        String oddCard3 = ranks.get(2);
        String oddCard4 = ranks.get(3);
        String oddCard5 = ranks.get(4);

        ArrayList<String> chosenSuits = pickMixedSuits(suits);
        deck.addCard(new PlayingCard(oddCard1 + chosenSuits.get(0)));
        deck.addCard(new PlayingCard(oddCard2 + chosenSuits.get(1)));
        deck.addCard(new PlayingCard(oddCard3 + chosenSuits.get(2)));
        deck.addCard(new PlayingCard(oddCard4 + chosenSuits.get(3)));
        deck.addCard(new PlayingCard(oddCard5 + chosenSuits.get(4)));
    }

    private static void getRandomPair(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        Collections.shuffle(ranks);
        String pair = ranks.get(0);
        String oddCard1 = ranks.get(1);
        String oddCard2 = ranks.get(2);
        String oddCard3 = ranks.get(3);

        Collections.shuffle(suits);
        deck.addCard(new PlayingCard(pair + suits.get(0)));
        deck.addCard(new PlayingCard(pair + suits.get(1)));

        Collections.shuffle(suits);
        deck.addCard(new PlayingCard(oddCard1 + suits.get(0)));

        Collections.shuffle(suits);
        deck.addCard(new PlayingCard(oddCard2 + suits.get(0)));

        Collections.shuffle(suits);
        deck.addCard(new PlayingCard(oddCard3 + suits.get(0)));
    }

    private static void getRandomTwoPair(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        Collections.shuffle(ranks);
        String firstPair = ranks.get(0);
        String secondPair = ranks.get(1);
        String oddCard = ranks.get(2);

        Collections.shuffle(suits);
        deck.addCard(new PlayingCard(firstPair + suits.get(0)));
        deck.addCard(new PlayingCard(firstPair + suits.get(1)));

        Collections.shuffle(suits);
        deck.addCard(new PlayingCard(secondPair + suits.get(0)));
        deck.addCard(new PlayingCard(secondPair + suits.get(1)));

        Collections.shuffle(suits);
        deck.addCard(new PlayingCard(oddCard + suits.get(0)));
    }

    private static void getRandomThreeOfAKind(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        Collections.shuffle(ranks);
        String rank3 = ranks.get(0);

        Collections.shuffle(suits);

        deck.addCard(new PlayingCard(rank3 + suits.get(0)));
        deck.addCard(new PlayingCard(rank3 + suits.get(1)));
        deck.addCard(new PlayingCard(rank3 + suits.get(2)));

        Collections.shuffle(suits);

        deck.addCard(new PlayingCard(ranks.get(1) + suits.get(0)));
        deck.addCard(new PlayingCard(ranks.get(2) + suits.get(1)));
    }

    private static void getRandomStraight(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        ranks.add(0, "A"); // A can also be 1

        List<String> possibleStarts = new ArrayList<>((List<String>) ranks
            .subList(0, ranks.indexOf("10")));
        Collections.shuffle(possibleStarts);

        String startRank = possibleStarts.get(0);
        int startRankPos = ranks.indexOf(startRank);

        // Mixed suits, or this would be a straight flush rather than a straight.
        ArrayList<String> chosenSuits = pickMixedSuits(suits);

        String suit = chosenSuits.get(0);
        deck.addCard(new PlayingCard(ranks.get(startRankPos) + suit));

        suit = chosenSuits.get(1);
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 1) + suit));

        suit = chosenSuits.get(2);
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 2) + suit));

        suit = chosenSuits.get(3);
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 3) + suit));

        suit = chosenSuits.get(4);
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 4) + suit));
    }

    private static void getRandomFlush(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        Collections.shuffle(suits);
        String suit = suits.get(0);

        // A run in one suit would be a straight flush, not a plain flush.
        do {
            Collections.shuffle(ranks);
        } while (isFiveInSequence(ranks.subList(0, 5)));

        deck.addCard(new PlayingCard(ranks.get(0) + suit));
        deck.addCard(new PlayingCard(ranks.get(1) + suit));
        deck.addCard(new PlayingCard(ranks.get(2) + suit));
        deck.addCard(new PlayingCard(ranks.get(3) + suit));
        deck.addCard(new PlayingCard(ranks.get(4) + suit));
    }

    private static void getRandomFullHouse(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {

        Collections.shuffle(ranks);
        String rank3 = ranks.get(0);
        String rank2 = ranks.get(1);

        Collections.shuffle(suits);

        deck.addCard(new PlayingCard(rank3 + suits.get(0)));
        deck.addCard(new PlayingCard(rank3 + suits.get(1)));
        deck.addCard(new PlayingCard(rank3 + suits.get(2)));

        Collections.shuffle(suits);

        deck.addCard(new PlayingCard(rank2 + suits.get(0)));
        deck.addCard(new PlayingCard(rank2 + suits.get(1)));
    }

    private static void getRandomFourOfAKind(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        Collections.shuffle(ranks);
        String rank = ranks.get(0);

        deck.addCard(new PlayingCard(rank + suits.get(0)));
        deck.addCard(new PlayingCard(rank + suits.get(1)));
        deck.addCard(new PlayingCard(rank + suits.get(2)));
        deck.addCard(new PlayingCard(rank + suits.get(3)));

        Collections.shuffle(suits);
        String suit = suits.get(0);
        rank = ranks.get(1);

        deck.addCard(new PlayingCard(rank + suit));
    }

    private static void getRandomStraightFlush(DeckOfCards deck, ArrayList<String> suits,
        ArrayList<String> ranks) {
        ranks.add(0, "A"); // A can also be 1

        List<String> possibleStarts = new ArrayList<>((List<String>) ranks
            .subList(0, ranks.indexOf("10")));
        Collections.shuffle(possibleStarts);

        String startRank = possibleStarts.get(0);
        int startRankPos = ranks.indexOf(startRank);

        Collections.shuffle(suits);
        String suit = suits.get(0);
        deck.addCard(new PlayingCard(ranks.get(startRankPos) + suit));
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 1) + suit));
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 2) + suit));
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 3) + suit));
        deck.addCard(new PlayingCard(ranks.get(startRankPos + 4) + suit));
    }

    private static void getRandomRoyalFlush(DeckOfCards deck, ArrayList<String> suits) {
        Collections.shuffle(suits);
        String suit = suits.get(0);
        deck.addCard(new PlayingCard("10" + suit));
        deck.addCard(new PlayingCard("J" + suit));
        deck.addCard(new PlayingCard("Q" + suit));
        deck.addCard(new PlayingCard("K" + suit));
        deck.addCard(new PlayingCard("A" + suit));
    }
}
