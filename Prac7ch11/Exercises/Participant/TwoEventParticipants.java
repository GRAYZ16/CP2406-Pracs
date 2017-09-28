package Participant;

public class TwoEventParticipants
{
	public static void main(String[] args)
	{
		Participant[] miniMarathon = new Participant[8];
		for(int i = 0; i < miniMarathon.length; i++)
		{
			miniMarathon[i] = new Participant("John Smith", i, "111");
		}
		miniMarathon[5] = new Participant("Joshua", 20, "Townsville");
		miniMarathon[0] = new Participant("Sara", 21, "Mikkeli");

		Participant[] marathon = new Participant[8];
		for(int i = 0; i < marathon.length; i++)
		{
			marathon[i] = new Participant("Joe Bloggs", i, "222");
		}

		marathon[6] = new Participant("Joshua", 20, "Townsville");
		marathon[1] = new Participant("Sara", 21, "Mikkeli");

		for(Participant participant1 : miniMarathon)
		{
			for(Participant participant2 : marathon)
			{
				if(participant1.equals(participant2))
					System.out.println(participant1.toString());
			}
		}
	}
}
