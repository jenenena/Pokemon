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
		appLayout.putConstraint(SpringLayout.NORTH, evolveField, 15, SpringLayout.SOUTH, numberField);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -184, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberField, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 86, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, nameLabel, -535, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, -5, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, nameField, 0, SpringLayout.WEST, evolveField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, changeButton);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -6, SpringLayout.WEST, changeButton);
		appLayout.putConstraint(SpringLayout.NORTH, imageLabel, 117, SpringLayout.SOUTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, imageLabel, -98, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, pokedexDropdown, 45, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 0, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, evolveLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolveField, 139, SpringLayout.EAST, evolveLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolveField, -184, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, evolveLabel, 5, SpringLayout.NORTH, evolveField);
		appLayout.putConstraint(SpringLayout.WEST, evolveLabel, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, enhancementField, 18, SpringLayout.SOUTH, evolveField);
		
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 5, SpringLayout.NORTH, enhancementField);
		appLayout.putConstraint(SpringLayout.WEST, healthLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, 17, SpringLayout.SOUTH, enhancementField);
		appLayout.putConstraint(SpringLayout.WEST, attackField, 118, SpringLayout.EAST, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, attackField, -184, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 5, SpringLayout.NORTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 0, SpringLayout.WEST, enhanceLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 20, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, healthField, 564, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -184, SpringLayout.EAST, this);
		
		appLayout.putConstraint(SpringLayout.NORTH, enhanceLabel, 5, SpringLayout.NORTH, healthField);
		appLayout.putConstraint(SpringLayout.EAST, enhanceLabel, -73, SpringLayout.WEST, healthField);
		appLayout.putConstraint(SpringLayout.WEST, enhancementField, 0, SpringLayout.WEST, evolveField);
		appLayout.putConstraint(SpringLayout.EAST, enhancementField, -184, SpringLayout.EAST, this);
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
		
		appLayout.putConstraint(SpringLayout.SOUTH, changeButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, changeButton, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, changeButton);
	}
	
	private void updateFields(int index)
	{
		String [] data = appController.getPokeData(index);
		
		attackField.setText(data[0]);
		enhancementField.setText(data[1]);
		healthField.setText(data[2]);
		nameField.setText(data[3]);
		evolveField.setText(data[4]);
		numberField.setText(data[5]);
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
				updateFields(pokedexDropdown.getSelectedIndex());
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
			data[0] = attackField.getText();
			data[1] = enhancementField.getText();
			data[2] = healthField.getText();
			data[3] = nameField.getText();
			data[4] = evolveField.getText();
			
			//insert code here
			appController.updatePokemon(index, data);
		}
	};
	
	private void changeImageDisplay(String name)
	{
		String path = "/pokemon/view/images/";
		String defaultName = "eeveeOG";
		String extension = ".jpeg";
		try
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + name.toLowerCase() + extension));
		}
		catch (NullPointerException missingFile)
		{
			pokemonIcon = new ImageIcon(getClass().getResource(path + defaultName + extension));
		}
		imageLabel.setIcon(pokemonIcon);
		repaint();
	}

}








