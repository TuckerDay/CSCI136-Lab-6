package game;

/*
Catey Meador
GamePanel.java

3/15/18
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel{
	
	// Attributes
	
	Player myPlayer = new Player("./src/Images/player.jpg",500,500, this);
	ImageIcon myIcon = new ImageIcon(myPlayer.getPlayerImage());
	
	Enemy myEnemy = new Enemy("./src/Images/enemy.jpg",100,100, this);
	ImageIcon myIcon2 = new ImageIcon(myEnemy.getEnemyImage());
	
	Item myItem = new Item("./src/Images/item.jpg",600,700, this);
	ImageIcon myIcon3 = new ImageIcon(myItem.getItemImage());
	
	JLabel myScore = new JLabel("Score: ");
	Font myFont = new Font("Arial", Font.BOLD, 32);
	
	Movement myMove = new Movement(myPlayer.getX(), myPlayer.getY(), myEnemy.getX(), myEnemy.getY());
	
	Timer myTimer = new Timer(100, new timerListener());
	
	int scoreCount = 0;
	
	// Constructor
	
	public GamePanel() {
		
		setLayout(new BorderLayout());
    	setPreferredSize(new Dimension(1920,1080));
    	setFocusable(true);
    	
    	myScore.setFont(myFont);
    	add(myScore);
    	
    	myTimer.start();
	}
	
	// Paint characters to screen
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(), myEnemy.getX(), myEnemy.getY(), null);
		page.drawImage(myIcon3.getImage(), myItem.getX(), myItem.getY(), null);
		
		// Enemy - Player collision
		if (areRectsColliding(myEnemy.getX(), myEnemy.getX() + 100, myEnemy.getY(), myEnemy.getY() + 100, myPlayer.getX(), myPlayer.getX() + 100, myPlayer.getY(), myPlayer.getY() + 100) == true)
		{
			page.drawString("YOU LOSE!", 1000, 500);
		}
		
		// Player - Item collision
		if (areRectsColliding(myItem.getX(), myItem.getX() + 100, myItem.getY(), myItem.getY() + 100, myPlayer.getX(), myPlayer.getX() + 100, myPlayer.getY(), myPlayer.getY() + 100) == true)
		{
			page.drawString("SCORE!", 1000, 500);
			scoreCount ++;
		}
		
	}
	
	// Enemy movement here
	private class timerListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			myEnemy.setX(myEnemy.getX() + myMove.getChangeX());
			myEnemy.setY(myEnemy.getY() + myMove.getChangeY());
			
			myScore.setText("Score: " + scoreCount);
			repaint();
		}
		
	}
	
	private boolean areRectsColliding(int r1TopLeftX, int r1BottomRightX, int r1TopLeftY, int r1BottomRightY, int r2TopLeftX, int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)
	{
		if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX && r1TopLeftY < r2BottomRightY && r1BottomRightY > r2TopLeftY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
