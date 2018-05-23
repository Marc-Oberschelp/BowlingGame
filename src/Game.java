class Game
{
    void roll(int pins)
    {
        m_line[m_currentBall] = pins;
        ++m_currentBall;
    }

    int score()
    {
        int score = 0;
        int ball = 0;
        for (int frame = 0; frame < 10; ++frame )
        {
            if (isStrike(ball))
            {
                score += 10 + strikeBonus(ball);
                ball++;
            }
            else if (isSpare(ball))
            {
                score += 10 + spareBonus(ball);
                ball+=2;
            }
            else
            {
                score += simpleFrameScore(ball);
                ball+=2;
            }

        }
        return score;
    }

    private int simpleFrameScore(int i)
    {
        return m_line[i] + m_line[i+1];
    }

    private int spareBonus(int i)
    {
        return m_line[i + 2];
    }

    private int strikeBonus(int i)
    {
        return m_line[i + 1] + m_line[i + 2];
    }

    private boolean isStrike(int i)
    {
        return m_line[i] == 10;
    }

    private boolean isSpare(int i)
    {
        return m_line[i] + m_line[i+1] == 10;
    }

    private int m_currentBall = 0;
    private int m_line[] = new int[21]; /* 21: Maximum number of throws */

}
