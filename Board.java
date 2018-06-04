package tictactoe;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

import javax.swing.JPanel;

public class Board extends JPanel implements  MouseListener{

	private int turn = 1;
	private Square [][] board = new Square [3][3];
	
	public Board() {
		addMouseListener(this);
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				board[i][j] = new Square(i+1,j+1);
			}
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println(x);
		for(int i=0;i<3;i++) {
			for(int j=0; j<3;j++) {
				if(board[i][j].selected(x, y) && board[i][j].getState()==0) {
					if(turn==1) {
						board[i][j].changeState(1);
					}
					else {
						board[i][j].changeState(2);
					}
					turn = -1*turn;
				}
			}
		}
		repaint();
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j].draw(g);
			}
		}
	}
		
	public int checkWinner() {
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
		if(board[2][2].getState()!=0) {
				if (board[0][2].getState()== board[1][2].getState() && board[0][2].getState()==board[2][2].getState()) {
					if(board[1][1].getState()==1) 
						return 1;
					
					else 
						return -1;
					
				}
				
				else if(board[2][0].getState()== board[2][1].getState() && board[2][0].getState()==board[2][2].getState()) {
					if(board[1][1].getState()==1) 
						return 1;
					
					else 
						return -1;

				}
		}
		
		return 0;
	}

}
