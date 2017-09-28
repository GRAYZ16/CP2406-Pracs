package SugarSmash;

public class SugarSmashPlayer
{

	private long playerID;
	private String screenName;
	protected int[] highScores;

	public SugarSmashPlayer(int playerID, String screenName, int levels)
	{
		this.playerID = playerID;
		this.screenName = screenName;
		highScores = new int[levels];
	}

	public long getPlayerID()
	{
		return playerID;
	}

	public void setPlayerID(int playerID)
	{
		this.playerID = playerID;
	}

	public String getScreenName()
	{
		return screenName;
	}

	public void setScreenName(String screenName)
	{
		this.screenName = screenName;
	}

	public int getHighScore(int gameLevel)
	{
		if(gameLevel < 0 || gameLevel > highScores.length)
		{
			System.out.println("Game Level is not valid");
			return -1;
		}

		return highScores[gameLevel];
	}

	public void setHighScore(int score, int gameLevel)
	{
		if(gameLevel < 0 || gameLevel > highScores.length)
		{
			System.out.println("Game Level is not valid");
			return;
		}

		if(gameLevel != 0)
		{
			for(int i = 0; i < gameLevel; i++)
			{
				if(highScores[gameLevel] < 100)
				{
					System.out.println("You need to score at least 100 points in previous levels to pass this level");
					return;
				}
			}
		}

		highScores[gameLevel] = score;
	}


}
