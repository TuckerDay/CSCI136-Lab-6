//***************************************************************
//Author: Tucker Day
//Partner: Catelyn Meador
//File: Enemy.java
//
//Purpose: Enemy class for lab 6 game
//Last Changed Date: 3/10/18
//***************************************************************
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Enemy {
	
	// Attributes
	private String enemyImage;
	private int xPos;
	private int yPos;
	
	GamePanel myPanel;
	
	
	// Constructor
	public Enemy(String enemyImage, int xPos, int yPos, GamePanel myPanel)
	{
		this.enemyImage = enemyImage;
		this.xPos = xPos;
		this.yPos = yPos;
		
		this.myPanel = myPanel;
		myPanel.setFocusable(true);
		
	}
	
	// Methods
	
	public void setX(int x) {
		this.xPos = x;
	}

	public void setY(int y) {
		this.yPos = y;
	}
	
	public String getEnemyImage()
	{
		return enemyImage;
	}
	
	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}
	

	
}
	
	
