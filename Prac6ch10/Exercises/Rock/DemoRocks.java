package Rock;

public class DemoRocks
{

	public static void main(String[] args)
	{
		Rock sedRock = new SedimentaryRock(10, 10);
		Rock metRock = new MetamorphicRock(40, 10);
		Rock igRock = new IgneousRock(1, 10);

		System.out.println(sedRock.getSampleNumber() + ", " + sedRock.getWeight() + ", " + sedRock.getDescription());
		System.out.println(metRock.getSampleNumber() + ", " + metRock.getWeight() + ", " + metRock.getDescription());
		System.out.println(igRock.getSampleNumber() + ", " + igRock.getWeight() + ", " + igRock.getDescription());
	}
}
