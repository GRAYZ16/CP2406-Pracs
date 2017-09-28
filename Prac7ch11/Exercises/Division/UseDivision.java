package Division;

public class UseDivision
{
	public static void main(String[] args)
	{
		InternationalDivision intDiv = new InternationalDivision("Google", 2204355, "United States of America", "English");
		DomesticDivision domDiv = new DomesticDivision("Ergon Energy", 1337, "Queensland");

		intDiv.display();
		domDiv.display();
	}
}
