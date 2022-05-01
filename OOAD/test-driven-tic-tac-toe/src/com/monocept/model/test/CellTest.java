package com.monocept.model.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.monocept.model.Cell;
import com.monocept.model.Mark;

class CellTest {

	@Test
	void testCellSHoudEmptyOnceCreate() {
	Cell cell = new Cell();
	assertTrue(cell.getMark()==null);
	}
	@Test
	void shouldBeAbleToMarkNought() {
		Cell c= new Cell();
		c.setMark(Mark.O);
		assertEquals(c.getMark(), Mark.O);
	}
	@Test
	void shouldBeAbleToMarkCross() {
		Cell c= new Cell();
		c.setMark(Mark.X);
		assertEquals(c.getMark(), Mark.X);
	}
	
	@Test
	void shouldThrowExceptionMarkedTice() {
		Cell c= new Cell();
		c.setMark(Mark.O);
		
		RuntimeException runtimeException = assertThrows(RuntimeException.class,()->{
			c.setMark(Mark.X);
		},"cell is marked"
		);
	}
}
