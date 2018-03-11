package game;
/*
Author: Catey Meador
Partner: Tucker Day
File: Item.java
Purpose: holds image for items and their x and y positions, gets item image and position
Creation Date: 3/10/18
*/

public class Item {
	
	private String itemImage;
	private int xPos;
	private int yPos;
	
	public Item(String itemImage, int xPos, int yPos)
	{
		this.itemImage = itemImage;
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	public String getItemImage()
	{
		return itemImage;
	}
	
	public int getXPos()
	{
		return xPos;
	}

	public int getYPos()
	{
		return yPos;
	}

}
