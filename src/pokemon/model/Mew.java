package pokemon.model;

public class Mew extends Pokemon implements Psychic
{
	public Mew()
	{
		super(7, "Mew");
	}
	
	public Mew(int number, String name)
	{
		super(number, name);
	}
	
	public void telepath()
	{
		System.out.println("I know what you're thinking");
	}
	
	public void dreamWeave()
	{
		System.out.println("Count sheep!");
	}

}
