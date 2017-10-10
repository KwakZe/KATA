import org.junit.Test;
import static junit.framework.TestCase.*;

public class TieBreakTest {

    @Test
    public void tieBreak() {
        Player one = new Player("one");
        Player two = new Player("two");
        Score score = new Score();
        Game game = new Game();
        Set set = new Set();

        while (one.getPlayerScore().getGame() != 5) {
            score.hasScored(one, two, game, set);
        }

        while (two.getPlayerScore().getGame() != 6) {
            score.hasScored(two, one, game, set);
        }

        while (one.getPlayerScore().getGame() != 6) {
            score.hasScored(one, two, game, set);
        }

        assertEquals(0, one.getPlayerScore().getSet().intValue());
        assertEquals(0, two.getPlayerScore().getSet().intValue());
        assertTrue(two.getPlayerScore().getInTieBreak());
        assertTrue(one.getPlayerScore().getInTieBreak());

        while (one.getPlayerScore().getTieBreakScore() != 5) {
            score.hasScored(one, two, game, set);
        }
        score.hasScored(one, two, game, set);

        assertEquals(0, one.getPlayerScore().getTieBreakScore().intValue());
        assertEquals(0, two.getPlayerScore().getTieBreakScore().intValue());
        assertEquals(1,one.getPlayerScore().getSet().intValue());
        assertTrue(one.getPlayerScore().getHasWon());
        assertFalse(two.getPlayerScore().getHasWon());
    }
}
