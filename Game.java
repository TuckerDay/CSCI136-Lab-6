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
	
	public Game(String characterName, int score, String boardWinner1, String boardWinner2, String boardWinner3, int boardWinner1Score, int boardWinner2Score, int boardWinner3Score)
	{
		this.characterName = characterName;
		this.score = score;
		this.boardWinner1 = boardWinner1;
		this.boardWinner2 = boardWinner2;
		this.boardWinner3 = boardWinner3;
		this.boardWinner1Score = boardWinner1Score;
		this.boardWinner2Score = boardWinner2Score;
		this.boardWinner3Score = boardWinner3Score;
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
