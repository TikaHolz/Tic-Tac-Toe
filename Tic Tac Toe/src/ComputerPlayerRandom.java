
public class ComputerPlayerRandom
	{
	
	public static void computerPlayerRandom()
			{
			int randomRow = (int)(Math.random()* 3);
			int randomCol =  (int)(Math.random()* 3);
			if(Board.board[randomRow][randomCol].equals(" "))
				{
				Board.board[randomRow][randomCol] = "O";
				}
			else
				{
				computerPlayerRandom();
				}
			}
	
	}
