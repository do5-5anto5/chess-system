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

	protected int getRow() {
		return rows;
	}

	protected void setRow(int row) {
		this.rows = row;
	}

	protected int getCollum() {
		return collums;
	}

	protected void setCollum(int collum) {
		this.collums = collum;
	}
	
	
	
}
