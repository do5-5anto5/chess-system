package boardgame;

public class Board {
	
	private int rows;
	private int collums;
	private Piece[][] pieces;
	
	public Board(int row, int collum) {
		this.rows = row;
		this.collums = collum;
		pieces = new Piece[rows][collums];
	}

	public int getRow() {
		return rows;
	}

	public void setRow(int row) {
		this.rows = row;
	}

	public int getCollum() {
		return collums;
	}

	public void setCollum(int collum) {
		this.collums = collum;
	}
}
