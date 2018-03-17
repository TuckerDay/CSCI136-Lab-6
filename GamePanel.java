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
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel{
	
	// Attributes
	
	Player myPlayer = new Player("./src/Images/dog.jpg",222,150, this);
	ImageIcon myIcon = new ImageIcon(myPlayer.getPlayerImage());
	
	
	
	Enemy myEnemy = new Enemy("./src/Images/pie.jpg",300,300, this);
	ImageIcon myIcon2 = new ImageIcon(myEnemy.getEnemyImage());
	
	Movement myMove = new Movement(myPlayer.getX(), myPlayer.getY(), myEnemy.getX(), myEnemy.getY());
	
	Timer myTimer = new Timer(100, new timerListener());
	
	// Constructor
	
	public GamePanel() {
		
		setLayout(new BorderLayout());
    	setPreferredSize(new Dimension(1920,1080));
    	setFocusable(true);
    	
    	myTimer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(), myEnemy.getX(), myEnemy.getY(), null);
	}
	
	// Enemy movement here
	private class timerListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			myEnemy.setX(myEnemy.getX() + myMove.getChangeX());
			myEnemy.setY(myEnemy.getY() + myMove.getChangeY());
			repaint();
			
			
		}
	}
}
