package Division;

public abstract class Division
{
	protected String divName;
	protected int accNumber;

	public Division(String divName, int accNumber)
	{
		this.divName = divName;
		this.accNumber = accNumber;
	}


	public abstract void display();
}
