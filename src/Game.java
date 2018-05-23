class Game
{
    void roll(int pins)
    {
        line[currentBall] = pins;
        ++currentBall;
    }

    int score()
    {
        int score = 0;
        int i = 0;
        for (int frame = 0; frame < 10; ++frame )
        {
            if (isStrike(i))
            {
                score += 10 + strikeBonus(i);
                i++;
            }
            if (isSpare(i))
            {
                score += 10 + spareBonus(i);
                i+=2;
            }
            else
            {
                score += simpleFrameScore(i);
                i+=2;
            }

        }
        return score;
    }

    private int simpleFrameScore(int i)
    {
        return line[i] + line[i+1];
    }

    private int spareBonus(int i)
    {
        return line[i + 2];
    }

    private int strikeBonus(int i)
    {
        return line[i + 1] + line[i + 2];
    }

    private boolean isStrike(int i)
    {
        return line[i] == 10;
    }

    private boolean isSpare(int i)
    {
        return line[i] + line[i+1] == 10;
    }

    private int currentBall = 0;
    private int line[] = new int[21]; /* 21: Maximum number of throws */

}
