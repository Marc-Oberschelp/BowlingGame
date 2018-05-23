import org.junit.*;

import static junit.framework.TestCase.*;


// http://codingdojo.org/kata/Bowling/
public class BowlingGame {
    @Before
    public void setUp()
    {
        m_g = new Game();
    }

    @Test
    public void ZeroGameTest()
    {
        rollBalls(20, 0);
        assertEquals(0, m_g.score());
    }

    private void rollBalls(int rolls, int pinValue)
    {
        for (int i = 0; i<rolls; ++i)
        {
            m_g.roll(pinValue);
        }
    }

    @Test
    public void AllOnesGame()
    {
        rollBalls(20, 1);
        assertEquals(20, m_g.score());
    }
    private Game m_g;
}
