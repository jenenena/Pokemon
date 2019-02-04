package pokemon.view;

import javax.swing.*;
import java.awt.Color;

public class PokedexPanel extends JPanel
{
	public SpringLayout appLayout;
	public PokedexController appController;
	
	public JTextField numberField;
	public JTextField nameField;
	public JTextField canEvolveField;
	
	public JLabel numberLabel;
	public JLabel nameLabel;
	public JLabel canEvolveLabel;
	
	public PokedexPanel (PokedexController appController)
	{
		//methods
		super();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		
		numberField = new JTextField("Pokemon Number here", 20);
		nameField = new JTextField("Pokemon Name here", 20);
		canEvolveField = new JTextField("Pokemon CanEvolve here", 20);	
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(800, 600));
		
		this.add(numberField);
		this.add(nameField);
		this.add(canEvolveField);
		this.add(numberLabel);
		this.add(nameLabel);
		this.add(canEvolveLabel);
	}
	
	private void setupLayout();
	{
		
	}
	
	private void setupListeners();
	{
		
	}

}








