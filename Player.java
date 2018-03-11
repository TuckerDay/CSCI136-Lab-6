//***************************************************************
//Author: Tucker Day
//Partner: Catelyn Meador
//File: Enemy.java
//
//Purpose: Enemy class for lab 6 game
//Last Changed Date: 3/10/18
//***************************************************************
package game;

public class Player {
	
	// Attributes
	private String playerImage;
	private int health;
	private int xPos;
	private int yPos;
	private int numItems;
	
	// Constructor
	public Player(String playerImage, int health, int xPos, int yPos, int numItems)
	{
		this.playerImage = playerImage;
		this.health = health;
		this.xPos = xPos;
		this.yPos = yPos;
		this.numItems = numItems;
	}
	
	// Methods
	public int updatePosition()
	{
		// updates enemy position using movement class
	}
	
	public String getPlayerImage()
	{
		// returns enemy image location
	}
	
	public int getHealth()
	{
		// returns health
	}
	
	public int getXPos()
	{
		// gets x position
	}
	
	public int getYPos()
	{
		// gets y position
	}
	
	public int getNumItems()
	{
		// gets number of items
	}
	
	public int setNumItems()
	{
		// sets number of items
	}
	
	public int setHealth()
	{
		//sets health
	}
	

}
