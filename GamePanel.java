/*
Catey Meador
GamePanel.java

3/15/18
*/

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel{
	
	Player myPlayer = new Player(222,150);
	
	public GamePanel() {
		
		setLayout(new BorderLayout());
    	setPreferredSize(new Dimension(1350,700));
    	
    	addKeyListener(this);
    	setFocusable(true);
    	
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);
		page.drawImage(myIcon.getImage(), player.getX(), myPie.getY(), null);
		page.drawImage(myIcon2.getImage(), myPie2.getX(), myPie2.getY(), null);
	}
}
