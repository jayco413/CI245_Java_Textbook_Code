import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

/**
 * This program provides advice to a blackjack player based on basic
 * strategy.  In addition, it tests every combination of cards possible
 * and compares the results against the known table to ensure that the
 * program is operating correctly.
 */
public class BasicStrategy {

    public static void main(String[] args) {

        String[] cards = { "A", "K", "Q", "J", "10", "9",
            "8", "7", "6", "5", "4", "3", "2" };

        String hardhands = "";
        String softhands = "";
        String splithands = "";

        // grading program, runs through all possibilities
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards.length; j++) {
                for (int k = 0; k < cards.length; k++) {
                    String dCard = cards[i];
                    String pCard1 = cards[j];
                    String pCard2 = cards[k];

                    int pCard1Value = ComputeCardValue(pCard1);
                    int pCard2Value = ComputeCardValue(pCard2);
                    int dCardValue = ComputeCardValue(dCard);

                    String result = CalculateMove(dCard, pCard1, pCard2);

                    if (pCard1.equals(pCard2)) {
                        splithands = splithands + result;
                    } else if (pCard1.equals("A")
                            || pCard2.equals("A")) {
                        softhands = softhands + result;
                    } else {
                        hardhands = hardhands + result;
                    }
                }
            }
        }

        // compares against the known solution
        System.out.println("Soft hands correct: "
            + MD5(softhands).equals("3a9eb1f92ff625fb994393d60e1520e4"));
        System.out.println("Hard hands correct: "
            + MD5(hardhands).equals("994a9b885a0370014210940a7393bf01"));
        System.out.println("Split hands correct: "
            + MD5(splithands).equals("4abaa8a171a5f8f40f9e60c2c49a020a"));
        System.out.println();

        // user input as specified by the lab problem
        String d, p1, p2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the dealer's up card: ");
        d = input.next();
        System.out.print("Enter the player's first card: ");
        p1 = input.next();
        System.out.print("Enter the player's second card: ");
        p2 = input.next();

        System.out.println("Basic Strategy Recommendation: "
            + CalculateMove(d, p1, p2));

        input.close();
    }

    private static String CalculateMove(String dCard,
            String pCard1, String pCard2) {

        // Default return value
        String output = "!"; // ! means invalid output

        // Set up some variables to hold the actual numerical values of the
        // cards and of the hand. Sometimes we will want to use the actual
        // names of the cards but other times it will be more useful to use
        // their values.
        int pCard1Value = ComputeCardValue(pCard1);
        int pCard2Value = ComputeCardValue(pCard2);
        int dCardValue = ComputeCardValue(dCard);
        int cardsum = pCard1Value + pCard2Value;

        // For output use the strings in the table: H, D, S, H/SU, SP
        // be sure to set the variable output to the result you want
        // ************ BEGIN WRITING YOUR CODE HERE ******************* //


        // ************ END WRITING YOUR CODE HERE ******************* //

        // Return the output
        return output;
    }

    /**
     * This method computes the numerical value of a card that is dealt.
     *
     * @param card The string representation of the card
     * @return The numerical value of the card
     */
    public static int ComputeCardValue(String card) {
        if (card.equalsIgnoreCase("A")) {
            return 11;
        } else if (card.equalsIgnoreCase("K")
                || card.equalsIgnoreCase("Q")
                || card.equalsIgnoreCase("J")) {
            return 10;
        } else {
            return Integer.parseInt(card);
        }
    }

    /**
     * This method generates an MD5 hash.
     *
     * @param md5 the string to transform
     * @return the md5 hash
     */
    public static String MD5(String md5) {
        try {
            java.security.MessageDigest md =
                java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes(Charset.forName("UTF-8")));
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF)
                    | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }
}
