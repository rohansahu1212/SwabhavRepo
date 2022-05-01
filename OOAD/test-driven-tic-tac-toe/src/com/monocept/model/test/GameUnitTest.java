package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Game;
import com.monocept.model.Mark;
import com.monocept.model.Player;
import com.monocept.model.Result;

class GameUnitTest {

	@Test
	void whenGameStartsCurrentPlayerIsPlayer1() {
		Board board = new Board();
		Player[] players = new Player[2];
		players[0] = new Player("rohanSahu", Mark.X);
		players[1] = new Player("ankitPanday", Mark.O);
		Game game = new Game(players, board);
		assertEquals(game.getCurrentPlayer(), players[0]);
		assertEquals(game.getCurrentPlayer().getMrk(), Mark.X);

	}

	@Test
	void whenGameSecondCurrentPlayerIsPlayer2() {
		Board board = new Board();
		Player[] players = new Player[2];
		players[0] = new Player("rohanSahu", Mark.X);
		players[1] = new Player("ankitPanday", Mark.O);
		Game game = new Game(players, board);
		game.play(2);
		assertEquals(game.getCurrentPlayer(), players[1]);
		assertEquals(game.getCurrentPlayer().getMrk(), Mark.O);

	}

	@Test
	void player1ShouldWinner() {
		Board board = new Board();
		Player[] players = new Player[2];
		players[0] = new Player("rohanSahu", Mark.X);
		players[1] = new Player("ankitPanday", Mark.O);
		Game game = new Game(players, board);
		game.play(2);
		game.play(5);
		game.play(1);
		game.play(7);
		game.play(0);
		game.play(8);
		assertEquals(game.getResult(), Result.WIN);
		assertEquals(game.getCurrentPlayer(), players[0]);
	}

	@Test
	void shouldDisplayProgress() {
		Board board = new Board();
		Player[] players = new Player[2];
		players[0] = new Player("rohanSahu", Mark.X);
		players[1] = new Player("ankitPanday", Mark.O);
		Game game = new Game(players, board);
		game.play(2);
		assertEquals(game.getResult(), Result.PROGRESS);
		game.play(5);
		assertEquals(game.getResult(), Result.PROGRESS);


	}

}
