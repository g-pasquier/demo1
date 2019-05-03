package com.starter.demo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
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

		LocalDateTime started = LocalDateTime.now();

		Order<Board> boardOrder = new OrderServiceBoard().add(new BoardService().createBoards(15));
		logger.info(boardOrder.toString());

		Order<Equipment> equipmentOrder = new OrderServiceEquipment().add(Arrays.asList(new Equipment("Donut", 150)));
		logger.info(equipmentOrder.toString());

		logger.info("Took " + Duration.between(started, LocalDateTime.now()).toMillis());
	}

}
