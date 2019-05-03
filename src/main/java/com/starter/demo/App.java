package com.starter.demo;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import com.starter.demo.order.Order;
import com.starter.demo.order.OrderServiceBoard;
import com.starter.demo.order.OrderServiceEquipment;

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
		Order<Board> firstOrder = new OrderServiceBoard().add(boards);
		logger.info(firstOrder.toString());

		Order<Equipment> nextOrder = new OrderServiceEquipment().add(Arrays.asList(new Equipment("Fix-a", 90)));
		logger.info(nextOrder.toString());
	}

}
