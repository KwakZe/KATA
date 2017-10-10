import org.junit.Test;
import static junit.framework.TestCase.*;

public class GameTest {

    @Test
    public void setWon() {
        Player one = new Player("one");
        Player two = new Player("two");
        Score score = new Score();
        Game game = new Game();
        Set set = new Set();

        while(one.getPlayerScore().getGame() != 6) {
            score.hasScored(one, two, game, set);
        }

        assertEquals(1, one.getPlayerScore().getSet().intValue());
    }

    @Test
    public void hasWonSet() {
        Player one = new Player("one");
        Player two = new Player("two");
        Set set = new Set();

        set.hasWonSet(one,two);
        assertTrue(set.getIsGameFinished());
    }
}
