package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee()
	{
		super(5, "Eevee");
	}
	public Eevee(int number, String name)
	{
		super(number, name);
	}

	public void afterYou()
	{
		System.out.println("Politeness");
	}
	
	public void rest()
	{
		System.out.println("Zzzzz");
	}
}
