package tasks;

/**
 * Solves card games problems with if and loop statements.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CardProblems
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class CardProblems
     */
    public CardProblems()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * Converts a card rank character representation to a numerical value
     *
     * @param  c  the card rank character representation
     * @return    the numerical value
     */
    public int getRank(char c)
    {
        int rank = -1;
        if (c == '2') {
            rank = 2;
        }
        else if (c == '3') {
            rank = 3;
        }
        else if (c == '4') {
            rank = 4;
        }
        else if (c == '5') {
            rank = 5;
        }
        else if (c == '6') {
            rank = 6;
        }
        else if (c == '7') {
            rank = 7;
        }
        else if (c == '8') {
            rank = 8;
        }
        else if (c == '9') {
            rank = 9;
        }
        else if (c == 'T') {
            rank = 10;
        }
        else if (c == 'J') {
            rank = 11;
        }
        else if (c == 'Q') {
            rank = 12;
        }
        else if (c == 'K') {
            rank = 13;
        }
        else if (c == 'A') {
            rank = 14;
        }
        return rank;
    }

    /**
     * Checks whether a five-card poker hand is a flush
     *
     * @param  hand  the five-card poker hand given as 10-character string
     * @return       true if all five cards are of the same suit, otherwise false
     */
    public boolean hasFlush(String hand)
    {
        boolean isFlush = false;
        
        char firstSuit = hand.charAt(1);
        char secondSuit = hand.charAt(3);
        char thirdSuit = hand.charAt(5);
        char fourthSuit = hand.charAt(7);
        char fifthSuit = hand.charAt(9);
        if (firstSuit == secondSuit
            && secondSuit == thirdSuit
            && thirdSuit == fourthSuit
            && fourthSuit == fifthSuit) {
            isFlush = true;
        }
        return isFlush;
    }

    /**
     * Determines whether the given five-card poker hand contains four of a kind
     *
     * @param  hand  the five-card poker hand given as 10-character string
     * @return       true if there are four cards of the same rank in the hand, otherwise false
     */
    public boolean hasFourOfAKind(String hand)
    {
        boolean hasFourOfAKind = false;

        char firstRank = hand.charAt(0);
        char secondRank = hand.charAt(2);
        char thirdRank = hand.charAt(4);
        char fourthRank = hand.charAt(6);
        char fifthRank = hand.charAt(8);

        if (firstRank == secondRank && secondRank == thirdRank && thirdRank == fourthRank
            || firstRank == secondRank && secondRank == thirdRank && thirdRank == fifthRank
            || firstRank == secondRank && secondRank == fourthRank && fourthRank == fifthRank
            || firstRank == thirdRank && thirdRank == fourthRank && fourthRank == fifthRank
            || secondRank == thirdRank && thirdRank == fourthRank && fourthRank == fifthRank) {

            hasFourOfAKind = true;
        }

        return hasFourOfAKind;
    }

    /**
     * Checks whether the given four-card hand is a badugi
     *
     * @param  hand  the four-card poker hand given as 8-character string
     * @return       true if no two cards have the same suit or rank, that is, all four ranks are different,
     *               and all four suits are different, otherwise false
     */
    public boolean hasFourCardBadugi(String hand)
    {
        boolean hasBadugi = false;

        char firstRank = hand.charAt(0);
        char secondRank = hand.charAt(2);
        char thirdRank = hand.charAt(4);
        char fourthRank = hand.charAt(6);

        char firstSuit = hand.charAt(1);
        char secondSuit = hand.charAt(3);
        char thirdSuit = hand.charAt(5);
        char fourthSuit = hand.charAt(7);

        if (firstRank != secondRank && firstRank != thirdRank && firstRank != fourthRank
            && secondRank != thirdRank && secondRank != fourthRank
            && thirdRank != fourthRank
            && firstSuit != secondSuit && firstSuit != thirdSuit && firstSuit != fourthSuit
            && secondSuit != thirdSuit && secondSuit != fourthSuit
            && thirdSuit != fourthSuit) {
            hasBadugi = true;
        }

        return hasBadugi;
    }

}
