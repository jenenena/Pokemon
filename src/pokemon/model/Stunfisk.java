package pokemon.model;

public class Stunfisk extends Pokemon implements Ground, Electric
{
	public Stunfisk(int number, String name)
	{
		super(10, "Stunfisk");
	}
	
	public void plow()
	{
		System.out.println("You're about to reap what I sow!");
	}
	
	public void excavate()
	{
		System.out.println("Dig this up!");
	}
	
	public int shockFactor()
	{
		return 24554;
	}
	
	public void ionBarrage()
	{
		System.out.println("Pew pew pew pew pew");
	}

}
