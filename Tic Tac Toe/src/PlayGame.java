import java.util.Scanner;
public class PlayGame
	{
	public static void main(String[] args)
		{
		Scanner userIntInput = new Scanner(System.in);
		System.out.println("Would you like to play Stupid or Genius?");
		System.out.println("(1) Stupid");
		System.out.println("(2) Genius");
		int stupidOrGenius = userIntInput.nextInt();
		Board.fillBoardWithBlankSpaces();
		Board.displayBoard();
		
		while (IsWon.stillPlaying == true)
			{
			if(stupidOrGenius == 1)
				{
				MovePlayerX.movePlayerX();
				Board.displayBoard();
				IsWon.isWonGame();
				ComputerPlayerRandom.computerPlayerRandom();
				Board.displayBoard();
				IsWon.isWonGame();	
				}
			else
				{
				MovePlayerX.movePlayerX();
				Board.displayBoard();
				IsWon.isWonGame();
				ComputerPlayerAI.computerPlayerAI();
				Board.displayBoard();
				IsWon.isWonGame();	
				}
			
			}
		
		}
	

	}
