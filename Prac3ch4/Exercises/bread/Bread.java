package bread;

public class Bread
{
	public static final String MOTTO = "The Staff of Life";

	private String type;
	private int calories;

	public Bread(String type, int calories)
	{
		this.type = type;
		this.calories = calories;
	}

	public String getType()
	{
		return type;
	}

	public int getCalories()
	{
		return calories;
	}
}
