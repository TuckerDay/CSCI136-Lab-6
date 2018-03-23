package game;
/*
Author: Catey Meador
Partner: Tucker Day
File: Item.java
Purpose: 
Creation Date: 3/10/18
*/

public class Item {
	
	private String itemImage;
	private int xPos;
	private int yPos;
	
	//constructor
	public Item (String itemImage, int xPos, int yPos, GamePanel myPanel)
	{
		this.itemImage = itemImage;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public String getItemImage()
	{
		return itemImage;
	}
	
	public int getX()
	{
		return xPos;
	}

	public int getY()
	{
		return yPos;
	}

}
