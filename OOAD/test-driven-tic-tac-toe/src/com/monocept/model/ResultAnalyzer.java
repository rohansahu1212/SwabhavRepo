package com.monocept.model;

public class ResultAnalyzer {
	private Board board;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	private Boolean horizontalCheck() {
		if (board.cell[0].getMark() == board.cell[1].getMark() && board.cell[0].getMark() == board.cell[2].getMark()) {
			if (board.cell[0].getMark() != Mark.EMPTY)
				return true;
		}
		if (board.cell[3].getMark() == board.cell[4].getMark() && board.cell[3].getMark() == board.cell[5].getMark()) {
			if (board.cell[3].getMark() != Mark.EMPTY)
				return true;
		}
		if (board.cell[6].getMark() == board.cell[7].getMark() && board.cell[6].getMark() == board.cell[8].getMark()) {
			if (board.cell[6].getMark() != Mark.EMPTY)
				return true;
		}
		return false;
	}

	private Boolean verticallyCheck() {
		if (board.cell[0].getMark() == board.cell[3].getMark() && board.cell[0].getMark() == board.cell[6].getMark()) {
			if (board.cell[0].getMark() != Mark.EMPTY)
				return true;
		}
		if (board.cell[1].getMark() == board.cell[4].getMark() && board.cell[1].getMark() == board.cell[7].getMark()) {
			if (board.cell[1].getMark() != Mark.EMPTY)
				return true;
		}
		if (board.cell[2].getMark() == board.cell[5].getMark() && board.cell[2].getMark() == board.cell[8].getMark()) {
			if (board.cell[2].getMark() != Mark.EMPTY)
				return true;
		}
		return false;
	}

	private Boolean diagonallyCheck() {
		if (board.cell[0].getMark() == board.cell[4].getMark() && board.cell[0].getMark() == board.cell[8].getMark()) {
			if (board.cell[0].getMark() != Mark.EMPTY)
				return true;
		}
		if (board.cell[2].getMark() == board.cell[4].getMark() && board.cell[4].getMark() == board.cell[6].getMark()) {
			if (board.cell[2].getMark() != Mark.EMPTY)
				return true;
		}
		return false;
	}

	public Result analyzeResult() {
		if (verticallyCheck())
			return Result.WIN;
		if (horizontalCheck())
			return Result.WIN;
		if (diagonallyCheck())
			return Result.WIN;
		if (board.isBoardFull())
			return Result.DRAW;
		return Result.PROGRESS;
	}

}
