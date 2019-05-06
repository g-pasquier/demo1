package com.starter.demo;

import static org.junit.Assert.assertTrue;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.starter.demo.order.Order;

public class BoardShopTest {

	BoardService serv = null;

	@Before
	public void setUp() {
		serv = new BoardService();
	}

	@Test
	public void test_factory_one_board() {
		BoardFactory facto = new BoardFactoryImpl();
		assertTrue(facto.makeBoard(new Random().nextInt(10)) instanceof Board);
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
		assertTrue(serv.createBoards(nbOf).stream().findAny().get() instanceof Board);
	}

	@Test
	public void test_has_different_order_ids() {
		Order<Board> a = new Order<>();
		Order<Board> b = new Order<>();
		assertTrue(a.getId() != b.getId());
	}

}
