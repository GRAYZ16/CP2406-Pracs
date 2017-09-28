package Rock;

public class Rock
{
	private int sampleNumber;
	private int weight;
	protected String description;

	public Rock(int sampleNumber, int weight)
	{
		this.sampleNumber = sampleNumber;
		this.weight = weight;
		this.description = "Unclassified";
	}

	public int getSampleNumber()
	{
		return sampleNumber;
	}

	public int getWeight()
	{
		return weight;
	}

	public String getDescription()
	{
		return description;
	}
}
