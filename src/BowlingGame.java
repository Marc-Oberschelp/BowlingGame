import org.junit.*;

import static junit.framework.TestCase.*;


// http://codingdojo.org/kata/Bowling/
public class BowlingGame {
    @Test
    public void ZeroGameTest()
    {
        Game g = new Game();
        for (int i = 0; i<20; ++i)
        {
            g.roll(0);
        }
        assertEquals(0, g.score());
    }

}
