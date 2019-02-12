package pokemon.view;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import pokemon.controller.PokedexController;
import java.awt.Dimension;

public class PokedexPanel extends JPanel
{
	
	private SpringLayout appLayout;
	private PokedexController appController;
	private JButton changeButton;
	private JComboBox<String> pokedexDropdoown;
	private JTextField numberField;
	private JTextField nameField;
	private JTextField evolveField;
	private JTextField attackField;
	private JTextField enhancementField;
	private JTextField healthField;
	
	private JLabel numberLabel;
	private JLabel nameLabel;
	private JLabel evolveLabel;
	private JLabel attackLabel;
	private JLabel enhanceLabel;
	private JLabel healthLabel;
	private JLabel imageLabel;
	
	
	public PokedexPanel(PokedexController appController)
	{
		//methods
		super();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		
		numberField = new JTextField("0");
		nameField = new JTextField("My pokename");
		evolveField = new JTextField("false");	
		attackField = new JTextField("0");
		enhancementField = new JTextField("0");
		healthField = new JTextField("0");
		
		numberLabel = new JLabel("This pokemon number is");
		healthLabel = new JLabel("This pokemon health is");
		evolveLabel = new JLabel("This pokemon can evolve");
		attackLabel = new JLabel("This pokemon attack level is");
		enhanceLabel = new JLabel("This pokemon enhancement level is");
		nameLabel = new JLabel("My name is");
		imageLabel = new JLabel("Pokemon goes here");
		
		changeButton = new JButton("Click here to change the pokevalues");
		pokedexDropdown = new JComboBox<String>();
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setBackground(Color.orange);
		this.setPreferredSize(new Dimension(800, 600));
		
		this.add(numberLabel);
		this.add(evolveLabel);
		this.add(nameLabel);
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(enhanceLabel);
		this.add(imageLabel);
		
		this.add(numberField);
		this.add(nameField);
		this.add(evolveField);
		this.add(attackField);
		this.add(enhancementField);
		this.add(healthField);
		
		this.add(changeButton);
		this.add(pokedexDropdown);
	}
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}
	
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void ActionPerformed(ActionEvent click)
			{
			
			}
		});
		
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void ActionPerformed(ActionEvent click)
			{
				
			}
		});
				
	}

}








