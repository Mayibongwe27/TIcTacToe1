package tictactoe;
import java.awt.Graphics;
import java.util.*;

public class Square {

	private int state;
	private int x, y;
	private int size;
	
	public Square(int row, int col) {
		this.state = 0;
		this.x = (col-1)*60;
		this.y = (row-1)*60;
		this.size = 60;
	}
	
	public void draw(Graphics g) {
		g.drawRect(x, y, size, size);
		switch (state) {
		case 1:
			g.drawLine(x+5, y+5, x+50, y+50);
			g.drawLine(x+50, y+5, x+5, y+50);
			break;
		case 2:
			g.drawOval(x+5, y+5, 50, 50);
			break;
		default:
			break;
		}
	}
	
	public boolean selected(int x, int y) {
		if(x>=this.x && x<=(this.x+60) && y>=this.y && y<=(this.y+60)) {
			return true;
		}
		return false;
	}
	
	public void changeState(int state) {
		this.state = state;
	}
	
	public int getState() {
		return state;
	}
}
