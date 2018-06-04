package tictactoe;

public class MethodClass {
	
	public static int checkWinner(Square [][] board) {
		
		if(board[0][0].getState()!=0) {
			if(board[0][0].getState()== board[0][1].getState() && board[0][0].getState()==board[0][2].getState()) {
				if(board[0][0].getState()==1) 
					return 1;
				
				else 
					return -1;
				
			}
			else if(board[0][0].getState()== board[1][0].getState() && board[0][0].getState()==board[2][0].getState()) {
				if(board[0][0].getState()==1) 
					return 1;
				
				else 
					return -1;
				
			}
			else if(board[0][0].getState()== board[1][1].getState() && board[0][0].getState()==board[2][2].getState()) {
				if(board[0][0].getState()==1) 
					return 1;
				
				else 
					return -1;
				
			}
		}
		
		if(board[1][1].getState()!=0) {
			if(board[1][1].getState()== board[0][1].getState() && board[1][1].getState()==board[2][1].getState()) {
				if(board[1][1].getState()==1) 
					return 1;
				
				else 
					return -1;
				
			}
			else if(board[1][1].getState()== board[2][0].getState() && board[1][1].getState()==board[0][2].getState()) {
				if(board[1][1].getState()==1) 
					return 1;
				
				else 
					return -1;
				
			}
			
			else if (board[1][1].getState()== board[1][0].getState() && board[1][1].getState()==board[1][2].getState()) {
				if(board[1][1].getState()==1) 
					return 1;
				
				else 
					return -1;
				
			}
		}
		
		
		return 0;
	}
}
