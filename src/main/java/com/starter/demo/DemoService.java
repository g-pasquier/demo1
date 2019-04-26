package com.starter.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

/**
 * 
 * @author frup70473
 *
 */
public class DemoService {

	private Logger logger = Logger.getAnonymousLogger();

	public List<Board> makeBoards() {

		BoardFactory factory = new BoardFactoryImpl();
		List<Board> boards = new ArrayList<Board>();

		for (int i = 0; i < 10; i++) {
			boards.add(factory.makeBoard(new Random().nextInt(3)));
		}
		logger.info(boards.toString());
		return boards;
	}
}
