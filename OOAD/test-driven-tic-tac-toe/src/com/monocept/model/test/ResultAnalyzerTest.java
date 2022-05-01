package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Mark;
import com.monocept.model.Result;
import com.monocept.model.ResultAnalyzer;

class ResultAnalyzerTest {

	@Test
	void shouldShowWinResultForXDiagonally() {
		Board b= new Board();
		b.markAtCellLocation(0,Mark.X);
		b.markAtCellLocation(4,Mark.X);
		b.markAtCellLocation(8,Mark.X);
		ResultAnalyzer ra= new ResultAnalyzer(b);
		assertEquals(ra.analyzeResult(), Result.WIN);    
	}
	@Test
	void shouldShowWinResultFornaughtDiagonally() {
		Board b= new Board();
		b.markAtCellLocation(0,Mark.O);
		b.markAtCellLocation(4,Mark.O);
		b.markAtCellLocation(8,Mark.O);
		ResultAnalyzer ra= new ResultAnalyzer(b);
		assertEquals(ra.analyzeResult(), Result.WIN);   
	}
	@Test
	void shouldShowWinResultForXVertically() {
		Board b= new Board();
		b.markAtCellLocation(0,Mark.X);
		b.markAtCellLocation(1,Mark.X);
		b.markAtCellLocation(2,Mark.X);
		ResultAnalyzer ra= new ResultAnalyzer(b);
		assertEquals(ra.analyzeResult(), Result.WIN);    
	}
	@Test
	void shouldShowWinResultForNoughVertically() {
		Board b= new Board();
		b.markAtCellLocation(0,Mark.O);
		b.markAtCellLocation(1,Mark.O);
		b.markAtCellLocation(2,Mark.O);
		ResultAnalyzer ra= new ResultAnalyzer(b);
		assertEquals(ra.analyzeResult(), Result.WIN);    
	}
	@Test
	void shouldShowWinResultForDraw() {
		Board b= new Board();
		b.markAtCellLocation(0,Mark.X);
		b.markAtCellLocation(1,Mark.X);
		b.markAtCellLocation(2,Mark.O);
		b.markAtCellLocation(3,Mark.O);
		b.markAtCellLocation(4,Mark.O);
		b.markAtCellLocation(5,Mark.X);
		b.markAtCellLocation(6,Mark.X);
		b.markAtCellLocation(7,Mark.X);
		b.markAtCellLocation(8,Mark.O);
		ResultAnalyzer ra= new ResultAnalyzer(b);
		assertEquals(ra.analyzeResult(), Result.DRAW);    
	}

}
