package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.border.Border;

import org.junit.jupiter.api.Test;

import com.monocept.model.Board;
import com.monocept.model.Cell;
import com.monocept.model.Mark;

class BoardTest {

	@Test
	void shouldBeAbleToCreatABoardWith9Cell() {
		Board b = new Board();

		assertEquals(b.getCell().length, 9);
	}

	@Test
	void shouldBeAbleToMarkSpecificLocation() {
		Board b = new Board();
		b.markAtCellLocation(2, Mark.O);
		Cell[] second=b.getCell();
		assertEquals(second[2].getMark(),Mark.O);
		
	}
	@Test
	void shouldThrowExceptionWrongIndexPassed() {
	
		assertThrows(RuntimeException.class, ()->{
			Board b= new Board();
			b.markAtCellLocation(0, Mark.O);
			b.markAtCellLocation(0, Mark.X);	
		});
	}

}
