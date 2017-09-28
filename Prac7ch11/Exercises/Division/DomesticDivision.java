package Division;

public class DomesticDivision extends Division
{
	private String state;

	public DomesticDivision(String divName, int accNumber, String state)
	{
		super(divName, accNumber);
		this.state = state;
	}

	@Override
	public void display()
	{
		System.out.println("Domestic Division: " + divName + "\nACC Number: " + accNumber + "\nState: " + state);
	}
}
