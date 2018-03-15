//***************************************************************
//Author: Tucker Day
//Partner: Catelyn Meador
//File: Enemy.java
//
//Purpose: Enemy class for lab 6 game
//Last Changed Date: 3/10/18
//***************************************************************

public class Player {
	
	// Attributes
	private String playerImage;
	//private int health;
	private int xPos;
	private int yPos;
	//private int numItems;
	
	// Constructor
	public Player(String playerImage, int xPos, int yPos)
	{
		this.playerImage = playerImage;
		//this.health = health;
		this.xPos = xPos;
		this.yPos = yPos;
		//this.numItems = numItems;
	}
	
	// Methods

	public void setX(int x) {
		this.xPos = x;
	}

	public void setY(int y) {
		this.yPos = y;
	}
	
	public String getPlayerImage()
	{
		return playerImage;
	}
	
	/*public int getHealth()
	{
		// returns health
	}*/
	
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}
	
	/*public int getNumItems()
	{
		// gets number of items
	}*/
	
	/*public int setNumItems()
	{
		// sets number of items
	}*/
	
	/*public int setHealth()
	{
		//sets health
	}*/
	

}
