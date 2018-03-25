package game;

/*
Author: Catey Meador
Partner: Tucker Day
File: Game.java
Purpose: holds character name and current score, sets and updates high scores, and checks for collisions
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
	
	public void calculateScore()
	{
		if (score > getBoardWinner1Score())
		{
			setBoardWinner1(getCharacterName());
			setBoardWinner1Score(getScore());
		}
		else if (score > getBoardWinner2Score())
		{
			setBoardWinner2(getCharacterName());
			setBoardWinner2Score(getScore());
		}
		else if (score > getBoardWinner3Score())
		{
			setBoardWinner3(getCharacterName());
			setBoardWinner3Score(getScore());
		}
		
	}
	
	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}

	public void setScore(int score)
	{
		this.score = score;
	}

	public void setBoardWinner1(String boardWinner1)
	{
		this.boardWinner1 = boardWinner1;
	}

	public void setBoardWinner2(String boardWinner2)
	{
		this.boardWinner2 = boardWinner2;
	}

	public void setBoardWinner3(String boardWinner3)
	{
		this.boardWinner3 = boardWinner3;
	}

	public void setBoardWinner1Score(int boardWinner1Score)
	{
		this.boardWinner1Score = boardWinner1Score;
	}

	public void setBoardWinner2Score(int boardWinner2Score)
	{
		this.boardWinner2Score = boardWinner2Score;
	}

	public void setBoardWinner3Score(int boardWinner3Score)
	{
		this.boardWinner3Score = boardWinner3Score;
	}
	
	public String getCharacterName()
	{
		return characterName;
	}

	public int getScore()
	{
		return score;
	}

	public String getBoardWinner1()
	{
		return boardWinner1;
	}

	public String getBoardWinner2()
	{
		return boardWinner2;
	}

	public String getBoardWinner3()
	{
		return boardWinner3;
	}

	public int getBoardWinner1Score()
	{
		return boardWinner1Score;
	}

	public int getBoardWinner2Score()
	{
		return boardWinner2Score;
	}

	public int getBoardWinner3Score()
	{
		return boardWinner3Score;
	}

}
