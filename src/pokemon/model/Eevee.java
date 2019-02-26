package pokemon.model;

public class Eevee extends Pokemon implements Normal
{
	public Eevee()
	{
		super(5, "Eevee");
		this.setCanEvolve(true);
	}
	public Eevee(int number, String name)
	{
		super(number, name);
		this.setCanEvolve(true);
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
