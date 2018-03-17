package game;

/*
Author: Catey Meador
Partner: Tucker Day
File: Game.java
Purpose: 
Creation Date: 3/10/18
*/

public class Game {

	private String characterName;
	private int score;
	private String boardWinner1;
	private String boardWinner2;
	private String boardWinner3;
	private int boardWinner1Score;
	private int boardWinner2Score;
	private int boardWinner3Score;
	
	// Constructor
	public Game()
	{
		
	}
	
	public String highScoreChecker()
	{
		return "updated high score stats";
	}
	
	private boolean collision(int r1TopLeftX, int r1BottomRightX,int r1TopLeftY, int r1BottomRightY, int r2TopLeftX,int r2BottomRightX, int r2TopLeftY, int r2BottomRightY)
		{
			if (r1TopLeftX < r2BottomRightX && r1BottomRightX > r2TopLeftX&& r1TopLeftY < r2BottomRightY && r1BottomRightY > r2TopLeftY)
			{
				return true;
			}
			else
			{
				return false;
			}
		}

}
