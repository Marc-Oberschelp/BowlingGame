class Game
{
    void roll(int pins)
    {
        m_score  += pins;
    }

    int score()
    {
        return m_score;
    }

    private int m_score;
}
