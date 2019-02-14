package pokemon.model;

public class Snorunt extends Pokemon implements Ice
{
	Snorunt()
	{
		super(10, "Snorunt");
	}
	
	public Snorunt(int number, String name)
	{
		super(number, name);
	}
	
	public void coldSnap()
	{
		System.out.println("A bit chilly, eh?");
	}
	
	public void blizzard()
	{
		System.out.println("Good luck seeing through all of this snow!");
	}

}
