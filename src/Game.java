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
            if (isSpare(i))
            {
                score += 10 + line[i+2];
            }
            else
            {
                score += line[i] + line[i+1];

            }
            i+=2;
        }
        return score;
    }

    private boolean isSpare(int i)
    {
        return line[i] + line[i+1] == 10;
    }

    private int currentBall = 0;
    private int line[] = new int[21]; /* 21: Maximum number of throws */

}
