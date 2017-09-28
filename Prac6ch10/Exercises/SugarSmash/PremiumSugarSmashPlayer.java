package SugarSmash;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{

    public PremiumSugarSmashPlayer(int playerID, String screenName)
    {
        super(playerID, screenName, 40);
    }

    @Override
	public void setHighScore(int score, int gameLevel)
	{
		if(gameLevel < 0 || gameLevel > highScores.length)
		{
			System.out.println("Game Level is not valid");
			return;
		}

		highScores[gameLevel] = score;
	}

}
