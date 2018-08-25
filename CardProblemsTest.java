package tasks;


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardProblemsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardProblemsTest
{
    private CardProblems cardProblems;
    /**
     * Default constructor for test class CardProblemsTest
     */
    public CardProblemsTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        cardProblems = new CardProblems();
    }

    @Test
    public void testGetRankReturnsSpot()
    {
        char input = '2';
        int rank = cardProblems.getRank(input);
        assertEquals(2, rank);
    }

    @Test
    public void testGetRankReturnsTen()
    {
        char input = 'T';
        int rank = cardProblems.getRank(input);
        assertEquals(10, rank);
    }

    @Test
    public void testGetRankReturnsFace()
    {
        char input = 'Q';
        int rank = cardProblems.getRank(input);
        assertEquals(12, rank);
    }

    @Test
    public void testHasFlushRegularHand() {
        String hand = "Kh3h7s8h2h";
        boolean hasFlush = cardProblems.hasFlush(hand);
        assertFalse(hasFlush);
    }

    @Test
    public void testHasFlush() {
        String flush = "As8sKs3sTs";
        boolean hasFlush = cardProblems.hasFlush(flush);
        assertTrue(hasFlush);
    }

    @Test
    public void testHasFourOfAKindRegularHand() {
        String hand = "TdTh8hJhJc";
        boolean hasForOfAKind = cardProblems.hasFourOfAKind(hand);
        assertFalse(hasForOfAKind);
    }

    @Test
    public void testHasFourOfAKind() {
        String fourOfAKindHand = "Kd7cKhKsKc";
        boolean hasForOfAKind = cardProblems.hasFourOfAKind(fourOfAKindHand);
        assertTrue(hasForOfAKind);
    }

    @Test
    public void testHasFourCardBadugiSameRanksInHand() {
        String hand = "4d4cKhJs";
        boolean hasBadugi = cardProblems.hasFourCardBadugi(hand);
        assertFalse(hasBadugi);
    }

    @Test
    public void testHasFourCardBadugiSameSuitsInHand() {
        String hand = "2d7cKhJd";
        boolean hasBadugi = cardProblems.hasFourCardBadugi(hand);
        assertFalse(hasBadugi);
    }

    @Test
    public void testHasFourCardBadugi() {
        String badugi = "2d7cKhJs";
        boolean hasBadugi = cardProblems.hasFourCardBadugi(badugi);
        assertTrue(hasBadugi);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
