package com.starter.demo;

import java.util.List;
import java.util.logging.Logger;

import com.starter.demo.order.Order;
import com.starter.demo.order.OrderServiceImpl;

/**
 * 
 * @author frup70473
 *
 */
public class App {

	private static Logger logger = Logger.getAnonymousLogger();

	public static void main(String... args) {

		// on boards
		List<Board> boards = new BoardService().generateRandomBoards(5);
		for (Board board : boards) {
			logger.info("" + board);
		}

		Order<Board> ready = new OrderServiceImpl().add(boards);
		logger.info(ready.toString());
	}

}
