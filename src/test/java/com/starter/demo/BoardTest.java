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
    public void before() {
        serv = new BoardService();
    }

    @Test
    public void test_make_zero() {
        int nbOf = 0;
        assertTrue(serv.generateRandomBoards(nbOf).size() == nbOf);
    }

    @Test
    public void test_make_one() {
        int nbOf = 1;
        assertTrue(serv.generateRandomBoards(nbOf).size() == nbOf);
    }

    @Test
    public void test_make_correct_type() {
        int nbOf = 1;
        assertTrue(serv.generateRandomBoards(nbOf).get(0) instanceof Board);
    }

}
