public class FormLetterWriter
{
	public static void main(String[] args)
	{
		FormLetterWriter writer = new FormLetterWriter();
		writer.displaySalutation("Gray");
		writer.displaySalutation("Joshua", "Gray");
	}

	public void displaySalutation(String lastName)
	{
		System.out.println("Dear Mr. or Ms. " + lastName + ',');
		displayMessage();
	}

	public void displaySalutation(String firstName, String lastName)
	{
		System.out.println("Dear " + firstName + ' ' + lastName + ',');
		displayMessage();
	}

	private void displayMessage()
	{
		System.out.println("\nThank you for your recent order.");
	}
}
