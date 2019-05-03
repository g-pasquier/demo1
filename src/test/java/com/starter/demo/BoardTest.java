package com.starter.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author frup70473
 *
 */
public class BoardTest {

	BoardService serv = null;

	@Before
	public void setUp() {
		serv = new BoardService();
	}

	@Test
	public void test_factory_one_board() {
		BoardFactory facto = new BoardFactoryImpl();
		assertTrue(facto.makeBoard(-1) instanceof Board);
	}

	@Test
	public void test_make_zero() {
		int nbOf = 0;
		assertTrue(serv.createBoards(nbOf).size() == nbOf);
	}

	@Test
	public void test_make_one() {
		int nbOf = 1;
		assertTrue(serv.createBoards(nbOf).size() == nbOf);
	}

	@Test
	public void test_make_correct_type() {
		int nbOf = 1;
		assertTrue(serv.createBoards(nbOf).get(0) instanceof Board);
	}

}
