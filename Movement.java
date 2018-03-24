/*
Author: Catey Meador
Partner: Tucker Day
File: Movement.java
Purpose: 
Creation Date: 3/10/18
*/



public class Movement {
	
	// Attributes
	private int playerX; // player position
	private int playerY;
	
	private int enemyX; // enemy position
	private int enemyY;
	
	private int changeX; // Slope of line to player
	private int changeY;

	
	// Constructor
	public Movement(int playerX, int playerY, int enemyX, int enemyY)
	{
		this.playerX = playerX;
		this.playerY = playerY;
		this.enemyX = enemyX;
		this.enemyY = enemyY;
	}
	
	// Methods
	public int getChangeX()
	{
		if (playerX > enemyX)
		{
			return 5;
		}
		else
		{
			return -5;
		}
	}
	public int getChangeY()
	{
		if (playerY > enemyY)
		{
			return 5;
		}
		else
		{
			return -5;
		}
	}
	

}
