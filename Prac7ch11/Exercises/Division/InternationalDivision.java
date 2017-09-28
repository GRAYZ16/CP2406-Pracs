package Division;


public class InternationalDivision extends Division
{
	private String country;
	private String language;

	public InternationalDivision(String divName, int accNumber, String country, String language)
	{
		super(divName, accNumber);
		this.country = country;
		this.language = language;
	}

	@Override
	public void display()
	{
		System.out.println("International Division: " + divName + "\nACC Number: " + accNumber + "\nCountry: " + country + "\nLanguage: " + language);
	}
}
