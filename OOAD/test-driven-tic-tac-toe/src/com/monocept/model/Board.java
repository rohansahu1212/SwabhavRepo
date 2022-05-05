package com.monocept.model;

public class Board {
	Cell[] cell = new Cell[9];

	public Board() {
		for (int i = 0; i < 9; i++) {
			cell[i] = new Cell();
		}
	}

	public boolean isBoardFull() {
		for (int i = 0; i < 9; i++) {
			if (cell[i].getMark() == Mark.EMPTY)
				return false;
		}
		return true;
	}

	public void markAtCellLocation(int index, Mark mrk) {
		cell[index].setMark(mrk);
	}

	public Cell[] getCell() {
		return cell;
	}

	public Cell getSpecificCell(int index) {
		return cell[index];
	}

}
