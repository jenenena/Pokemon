package pokemon.model;

public class Squirtle extends Pokemon implements Water
{
	public Squirtle()
	{
		super(8, "Squirtle");
		
	}
	public Squirtle(int number, String name)
	{
		super(number, name);
	}
	public void torpedo()
	{
		System.out.println("Fwisk!");
	}
	
	public void splashy()
	{
		System.out.println("Now you are drenched!");
	}

}
