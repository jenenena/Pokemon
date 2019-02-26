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
	private JButton saveButton;
	private JComboBox<String> pokedexDropdown;
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
	
	private ImageIcon pokemonIcon;
	
	
	public PokedexPanel(PokedexController appController)
	{
		//methods
		super();

		numberField = new JTextField("0");
		numberField.setEnabled(false);
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
		imageLabel = new JLabel("Pokemon goes here", pokemonIcon, JLabel.CENTER);
		changeButton = new JButton("Click here to change the pokevalues");
		saveButton = new JButton("Save");
		pokedexDropdown = new JComboBox<String>();
		
		this.appController = appController;
		this.appLayout = new SpringLayout();
		this.pokemonIcon = new ImageIcon(getClass().getResource("/pokemon/view/images/eeveeOG.jpeg"));

		setupPanel();
		setupDropdown();
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
		
		this.add(imageLabel);
		imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
		imageLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(changeButton);
		this.add(saveButton);
		this.add(pokedexDropdown);
	}
	
	private void setupDropdown()
	{
		DefaultComboBoxModel<String> temp = new DefaultComboBoxModel<String>(appController.buildPokedexText());
		pokedexDropdown.setModel(temp);
	}

	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 86, SpringLayout.NORTH, this);
		
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, numberLabel);
		
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 28, SpringLayout.SOUTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 25, SpringLayout.SOUTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveLabel, 0, SpringLayout.EAST, numberLabel);
		
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 27, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, numberLabel);
		
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 30, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhanceLabel, 0, SpringLayout.WEST, numberLabel);
		
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -21, SpringLayout.NORTH, numberLabel);
		
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, changeButton, -10, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, -4, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, changeButton);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, -5, SpringLayout.NORTH, enhanceLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthField, 0, SpringLayout.EAST, numberField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 0, SpringLayout.WEST, numberField);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -301, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberField, 0, SpringLayout.EAST, enhancementField);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, evolveField);
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, -5, SpringLayout.NORTH, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, imageLabel, 35, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, imageLabel, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 152, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		changeButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				sendDataToController();
			}
		});
		
		pokedexDropdown.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String name = pokedexDropdown.getSelectedItem().toString();
				changeImageDisplay(name);
			}
		});
		
		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				appController.savePokedex();
			}
			
		});
				
	}
	
	private void sendDataToController()
	{
		int index = pokedexDropdown.getSelectedIndex();
		
		if(appController.isInt(attackField.getText()) && appController.isDouble(enhancementField.getText()) && appController.isInt(healthField.getText()))
		{
			String [] data = new String[5];
			
			//insert code here
			appController.updatePokemon(index, data);
		}
	};
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "eeveeOG";
		String extension = "png";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		imageLabel.setIcon(pokemonIcon);;
		repaint();
	}

}








