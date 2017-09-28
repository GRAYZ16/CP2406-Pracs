package Participant;

public class Participant
{
	private String name;
	private int age;
	private String address;

	public Participant(String name, int age, String address)
	{
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String toString()
	{
		return "Name: " + name + "\nAge: " + age + "\nAddress: " + address;
	}

	public boolean equals(Object obj)
	{
		final Participant participant = (Participant) obj;

		return participant.name.equals(this.name) && participant.age == this.age && participant.address.equals(this.address);
	}

}
