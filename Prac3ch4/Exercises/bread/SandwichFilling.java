package bread;

public class SandwichFilling
{
	private String fillingType;
	private int calories;

	public SandwichFilling(String fillingType, int calories)
	{
		this.fillingType = fillingType;
		this.calories = calories;
	}

	public String getFillingType()
	{
		return fillingType;
	}

	public int getCalories()
	{
		return calories;
	}
}
