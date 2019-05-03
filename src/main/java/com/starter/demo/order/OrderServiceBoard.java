package com.starter.demo.order;

import java.util.List;
import java.util.Random;

import com.starter.demo.Board;

public class OrderServiceBoard implements OrderService<Board> {

	@Override
	public Order<Board> add(List<?> items) {

		Order<Board> order = new Order<Board>();
		order.setId(new Random().nextInt());
		order.setItems(items);
		order.setTotalPrice(items.stream().mapToInt(b -> ((Board) b).getPrice()).sum());

		return order;
	}

}
