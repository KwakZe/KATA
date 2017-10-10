import org.junit.Test;
import static junit.framework.TestCase.*;

public class ScoreTest {

    @Test
    public void increaseScore(){
        Player one = new Player("one");
        Player two = new Player("two");
        Score score = new Score();
        Game game = new Game();
        Set set = new Set();

        score.hasScored(one, two, game, set);
        assertEquals(15, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(0, two.getPlayerScore().getCurrentGameScore().intValue());

        //Check init
        assertFalse(one.getPlayerScore().getInTieBreak());
        assertFalse(two.getPlayerScore().getInTieBreak());
        assertFalse(one.getPlayerScore().getHasWon());
        assertFalse(two.getPlayerScore().getHasWon());
        assertFalse(one.getPlayerScore().getAdvantage());
        assertFalse(two.getPlayerScore().getAdvantage());

        score.hasScored(one, two, game, set);
        assertEquals(30, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(0, two.getPlayerScore().getCurrentGameScore().intValue());

        score.hasScored(one, two, game, set);
        assertEquals(40, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(0, two.getPlayerScore().getCurrentGameScore().intValue());

        score.hasScored(two, one, game, set);
        assertEquals(40, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(15, two.getPlayerScore().getCurrentGameScore().intValue());

        score.hasScored(two, one, game, set);
        assertEquals(40, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(30, two.getPlayerScore().getCurrentGameScore().intValue());

        score.hasScored(two, one, game, set);
        assertEquals(40, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(40, two.getPlayerScore().getCurrentGameScore().intValue());

        score.hasScored(one, two, game, set);
        assertTrue(one.getPlayerScore().getAdvantage());
        assertFalse(two.getPlayerScore().getAdvantage());
        assertEquals(40, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(40, two.getPlayerScore().getCurrentGameScore().intValue());

        score.hasScored(one, two, game, set);
        assertEquals(0, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(0, two.getPlayerScore().getCurrentGameScore().intValue());
    }

    @Test
    public void advantage() {
        Player one = new Player("one");
        Player two = new Player("two");
        Score score = new Score();
        Game game = new Game();
        Set set = new Set();

        score.hasScored(one, two, game, set);
        score.hasScored(one, two, game, set);
        score.hasScored(one, two, game, set);
        score.hasScored(two, one, game, set);
        score.hasScored(two, one, game, set);
        score.hasScored(two, one, game, set);
        assertEquals(40, one.getPlayerScore().getCurrentGameScore().intValue());
        assertEquals(40, two.getPlayerScore().getCurrentGameScore().intValue());

        score.hasScored(two, one, game, set);
        assertTrue(two.getPlayerScore().getAdvantage());
        assertFalse(one.getPlayerScore().getAdvantage());

        score.hasScored(one, two, game, set);
        assertFalse(one.getPlayerScore().getAdvantage());
        assertFalse(two.getPlayerScore().getAdvantage());
    }
}
