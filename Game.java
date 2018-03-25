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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import java.util.Random;

public class GamePanel extends JPanel{
	
	// Attributes
	
	Player myPlayer = new Player("./src/Images/player.jpg",500,500, this); // player
	ImageIcon myIcon = new ImageIcon(myPlayer.getPlayerImage());
	
	Enemy myEnemy = new Enemy("./src/Images/enemy.jpg",100,100, this); // enemy
	ImageIcon myIcon2 = new ImageIcon(myEnemy.getEnemyImage());
	
	Item myItem = new Item("./src/Images/item.jpg",700,500, this); // item
	ImageIcon myIcon3 = new ImageIcon(myItem.getItemImage());
	
	JLabel myScore = new JLabel("Score: "); // score
	Font myFont = new Font("Arial", Font.BOLD, 32);
	
	Game myGame = new Game("",0,"","","",0,0,0);
	
	
	Timer myTimer = new Timer(100, new timerListener());
	
	int scoreCount = 0;
	
	JPanel titleScreen;
	JPanel endScreen;
	JTextField userName;
	JButton startButton;
	JButton again;
	JLabel instructions;
	JLabel prompt;
	JLabel title;
	JLabel youLose;
	JLabel highScore;
	JLabel yourScore;
	JLabel winners;
	
	// Constructor
	public GamePanel() {
		
		setLayout(new BorderLayout());
    	setPreferredSize(new Dimension(1350,725));
    	setFocusable(true);
       		
    	// Title Screen
    	titleScreen = new JPanel();
    	titleScreen.setPreferredSize(new Dimension(1350,725));
    	titleScreen.setLayout(new BorderLayout());
    	add(titleScreen);
    	startButton = new JButton("Start Game!");
    	instructions = new JLabel("Use arrow keys to move");
    	prompt = new JLabel("Enter a username:");
    	title = new JLabel("WELCOME TO SHITTY PACMAN");
    	userName = new JTextField();
    	startButton.setFont(myFont);
    	instructions.setFont(myFont);
    	prompt.setFont(myFont);
    	title.setFont(myFont);
    	titleScreen.add(prompt, BorderLayout.WEST);
    	titleScreen.add(userName, BorderLayout.CENTER);
    	titleScreen.add(instructions, BorderLayout.SOUTH);
    	titleScreen.add(startButton, BorderLayout.EAST);
    	titleScreen.add(title, BorderLayout.NORTH);
    	startButton.addActionListener(new buttonHandler());
    	
    	// End Screen
    	endScreen = new JPanel();
    	endScreen.setPreferredSize(new Dimension(1300,700));
    	endScreen.setLayout(new BorderLayout());
    	youLose = new JLabel("GAME OVER");
    	highScore = new JLabel("HIGHSCORES:");
    	yourScore = new JLabel(myGame.getCharacterName() + ": " + myGame.getScore());
    	winners = new JLabel("<html><body>" + myGame.getBoardWinner1() + ": " + myGame.getBoardWinner1Score() + "<br>" + myGame.getBoardWinner2() + ": " + myGame.getBoardWinner2Score() + "<br>" + myGame.getBoardWinner3() + ": " + myGame.getBoardWinner3Score() + "</body></html>");
    	youLose.setFont(myFont);
    	highScore.setFont(myFont);
    	yourScore.setFont(myFont);
    	winners.setFont(myFont);
    	endScreen.add(youLose, BorderLayout.NORTH);
    	endScreen.add(yourScore, BorderLayout.SOUTH);
    	endScreen.add(highScore, BorderLayout.WEST);
    	endScreen.add(winners, BorderLayout.CENTER);
    	again = new JButton("Try Again");
    	again.setFont(myFont);
    	again.addActionListener(new buttonHandler());
    	endScreen.add(again, BorderLayout.EAST);
    	
    	myTimer.start();
    	
    	// Player Score
    	myScore.setFont(myFont);
    	//add(myScore, BorderLayout.NORTH);			
	}
	
	// Button Handler
	private class buttonHandler implements ActionListener
	    {
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				if (arg0.getSource()==startButton)
				{
					remove(titleScreen);
					myGame.setCharacterName(userName.getText());
				}
				else if (arg0.getSource()==again)
				{
					remove(endScreen);
					myEnemy.setX(0);
					myEnemy.setY(0);
					myPlayer.setX(700);
					myPlayer.setY(300);
					scoreCount = 0;
					myTimer.start();
				}
			}
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
			
			myGame.setScore(scoreCount);
			myGame.calculateScore();
			
			add(endScreen);
			myTimer.stop();
		}
		
		// Player - Item collision
		if (areRectsColliding(myItem.getX(), myItem.getX() + 100, myItem.getY(), myItem.getY() + 100, myPlayer.getX(), myPlayer.getX() + 100, myPlayer.getY(), myPlayer.getY() + 100) == true)
		{
			Random randNum = new Random();
			int randXPos = randNum.nextInt(1350);
			int randYPos = randNum.nextInt(725);
			myItem.setXPos(randXPos);
			myItem.setYPos(randYPos);
			page.drawString("SCORE!", 1000, 500);
			scoreCount ++;
		}		
	}
	
	// Enemy movement here
	private class timerListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			Movement myMove = new Movement(myPlayer.getX(), myPlayer.getY(), myEnemy.getX(), myEnemy.getY());
			myEnemy.setX(myEnemy.getX() + myMove.getChangeX());
			myEnemy.setY(myEnemy.getY() + myMove.getChangeY());
			myScore.setText("Score: " + scoreCount);
			repaint();
		}
		
	}
	
	// Method for collision detection
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
