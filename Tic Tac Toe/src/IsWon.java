
public class IsWon
	{
	static boolean stillPlaying = true;
	public static void isWonGame()
		{
		if ((Board.board[0][0].equals(Board.board[0][1]) && Board.board[0][1].equals(Board.board[0][2]) && !Board.board[0][1].equals(" ")) ||
			(Board.board[1][0].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[1][2]) && !Board.board[1][1].equals(" ")) ||
			(Board.board[2][0].equals(Board.board[2][1]) && Board.board[2][1].equals(Board.board[2][2]) && !Board.board[2][1].equals(" ")) ||
			(Board.board[0][0].equals(Board.board[1][0]) && Board.board[1][0].equals(Board.board[2][0]) && !Board.board[1][0].equals(" ")) ||				
			(Board.board[0][1].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[2][1]) && !Board.board[1][1].equals(" ")) ||
			(Board.board[0][2].equals(Board.board[1][2]) && Board.board[1][2].equals(Board.board[2][2]) && !Board.board[1][2].equals(" ")) ||
			(Board.board[0][0].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[2][2]) && !Board.board[1][1].equals(" ")) ||
			(Board.board[0][2].equals(Board.board[1][1]) && Board.board[1][1].equals(Board.board[2][0]) && !Board.board[1][1].equals(" ")))
				{
				System.out.println("The game is over!");
				stillPlaying = false;
				System.exit(0);
				}
		}

	}
