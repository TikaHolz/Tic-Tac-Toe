import java.util.Scanner;
public class MovePlayerX
	{
	    public static void movePlayerX()
	        {
	        Scanner userStringInput = new Scanner(System.in);
	        System.out.println("Where would you like to place your X?");
	        String userMove = userStringInput.nextLine();
	        switch(userMove)
	            {
	            case "A1":
	            case "a1":
	                {
	                Board.board[0][0] = "X";
	                ComputerPlayerAI.hitAndWin[0][0] = 5;
	                break;
	                }
	            case "A2":
	            case "a2":
	                {
	                Board.board[0][1] = "X"; 
	                ComputerPlayerAI.hitAndWin[0][1] = 5;
	                break;
	                }
	            case "A3":
	            case "a3":
	                {
	                Board.board[0][2] = "X"; 
	                ComputerPlayerAI.hitAndWin[0][2] = 5;
	                break;
	                }
	            case "B1":
	            case "b1":
	                {
	                Board.board[1][0] = "X"; 
	                ComputerPlayerAI.hitAndWin[1][0] = 5;
	                break;
	                }
	            case "B2":
	            case "b2":
	                {
	                Board.board[1][1] = "X"; 
	                ComputerPlayerAI.hitAndWin[1][1] = 5;
	                break;
	                }
	            case "B3":
	            case "b3":
	                {
	                Board.board[1][2] = "X"; 
	                ComputerPlayerAI.hitAndWin[1][2] = 5;
	                break;
	                }
	            case "C1":
	            case "c1":
	                {
	                Board.board[2][0] = "X"; 
	                ComputerPlayerAI.hitAndWin[2][0] = 5;
	                break;
	                }
	            case "C2":
	            case "c2":
	                {
	                Board.board[2][1] = "X";
	                ComputerPlayerAI.hitAndWin[2][1] = 5;
	                break;
	                }
	            case "C3":
	            case "c3":
	                {
	                Board.board[2][2] = "X"; 
	                ComputerPlayerAI.hitAndWin[2][2] = 5;
	                break;
	                }
	            default:
	                {
	                }
	            }
	        }

	}
