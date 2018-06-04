package tictactoe;

import javax.swing.JFrame;

public class GameApp {

	public static void main (String [] args) {
		JFrame myFrame = new JFrame();
		myFrame.setSize(400,400);
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setTitle("Simple Calculator");
		Board board = new Board();
		myFrame.add(board);
		myFrame.setVisible(true);
		
	}
}
