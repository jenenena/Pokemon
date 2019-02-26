package pokemon.model;

public class Sharky extends Pokemon implements Water
{

	public Sharky()
	{
		super(87456, "Sharky");
	}
	
	public Sharky(int number, String name)
	{
		super(number, name);
	}
	
	public void torpedo()
	{
		System.out.println("5 headed shark attack!");
	}
	
	public void splashy()
	{
		System.out.println("Sploosh Sploosh Sploosh");
	}
}
