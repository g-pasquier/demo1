package com.starter.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author frup70473
 *
 */
public class BoardService {

	public List<Board> createBoards(int nbOf) {

		BoardFactory factory = new BoardFactoryImpl();
		List<Board> boards = new ArrayList<Board>();

		int i = 0;
		while (i++ < nbOf) {
			boards.add(factory.makeBoard(new Random().nextInt(3)));
		}
		return boards;
	}
}
