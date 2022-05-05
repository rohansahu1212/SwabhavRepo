package com.monocept.model;

public class Game {

	private Result result;
	private Player[] players = new Player[1];
	private ResultAnalyzer resultAnal;
	private Board board;
	private int turn=2; 

	public Game(Player[] players, Board board) {

		this.result = result;
		this.players = players;
		this.board = board;
		resultAnal = new ResultAnalyzer(board);
	}
	
	public Player getCurrentPlayer() {
		return players[turn%2];
	}
	public Result play(int celllocation) {
		board.markAtCellLocation(celllocation, players[turn%2].getMrk());
		turn++;
		return resultAnal.analyzeResult();
	}
	public Result getResult() {
		return result;
	}

}
