import org.junit.*;

import static junit.framework.TestCase.*;


// http://codingdojo.org/kata/Bowling/
public class BowlingGame {
    @Before
    public void setUp()
    {
        m_g = new Game();
    }



    private void rollBalls(int rolls, int pinValue)
    {
        for (int i = 0; i<rolls; ++i)
        {
            m_g.roll(pinValue);
        }
    }
    private void RollSpare()
    {
        m_g.roll(6);
        m_g.roll(4);
    }

    private void RollSimpleFrame()
    {
        m_g.roll(8);
        m_g.roll(1);
    }

    @Test
    public void ZeroGame()
    {
        rollBalls(20, 0);
        assertEquals(0, m_g.score());
    }

    @Test
    public void AllOnesGame()
    {
        rollBalls(20, 1);
        assertEquals(20, m_g.score());
    }

    @Test
    public void ThrowSimpleFrameAfterSpare()
    {
        RollSpare();
        RollSimpleFrame();
        rollBalls(16,0);
        assertEquals(27, m_g.score());
    }
    @Test
    public void ThrowSimpleFrameAfterStrike()
    {
        m_g.roll(10);
        RollSimpleFrame();
        rollBalls(16,0);
        assertEquals(28, m_g.score());
    }

    private Game m_g;
}
