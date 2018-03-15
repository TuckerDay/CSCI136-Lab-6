/*
Catey Meador
GamePanel.java

3/15/18
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel{
	
	Player myPlayer = new Player("./src/Pacman.jpg",222,150);
	ImageIcon myIcon = new ImageIcon(myPlayer.getPlayerImage());
	Enemy myEnemy = new Enemy("./src/Ghost.jpg",300,300);
	ImageIcon myIcon2 = new ImageIcon(myEnemy.getEnemyImage());
	Timer myTimer = new Timer(500, new timerListener());
	
	public GamePanel() {
		
		setLayout(new BorderLayout());
    	setPreferredSize(new Dimension(1350,700));
    	
    	addKeyListener(this);
    	setFocusable(true);
    	myTimer.start();
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), myPlayer.getX(), myPlayer.getY(), null);
		page.drawImage(myIcon2.getImage(), myEnemy.getX(), myEnemy.getY(), null);
	}
}
