//***************************************************************
//Author: Tucker Day
//Partner: Catelyn Meador
//File: Player.java
//
//Purpose: PLayer class
//Last Changed Date: 3/10/18
//***************************************************************
package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener {
	
	// Attributes
	private String playerImage;
	//private int health;
	private int xPos;
	private int yPos;
	//private int numItems;
	
	GamePanel myPanel;
	
	
	// Constructor
	public Player(String playerImage, int xPos, int yPos, GamePanel myPanel)
	{
		this.playerImage = playerImage;
		//this.health = health;
		this.xPos = xPos;
		this.yPos = yPos;
		//this.numItems = numItems;
		
		// Refers to panel
		this.myPanel = myPanel;
		myPanel.setFocusable(true);
		myPanel.addKeyListener(this);
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
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_LEFT)
		{
			setX(getX()-10);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			setX(getX()+10);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_UP)
		{
			setY(getY()-10);
		}
		
		else if(arg0.getKeyCode() == KeyEvent.VK_DOWN)
		{
			setY(getY()+10);
		}
	myPanel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
