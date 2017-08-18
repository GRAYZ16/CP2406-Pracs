package bread;

public class Sandwich
{
	Bread bread;
	SandwichFilling filling;
	int sandwichCalories;

	public Sandwich(String breadType, String fillingType, int breadCalories, int fillingCalories)
	{
		bread = new Bread(breadType, breadCalories);
		filling = new SandwichFilling(fillingType, fillingCalories);
		sandwichCalories = 2 * breadCalories + fillingCalories;
	}

	public Bread getBread()
	{
		return bread;
	}

	public SandwichFilling getFilling()
	{
		return filling;
	}

	public int getCalories()
	{
		return sandwichCalories;
	}
}
