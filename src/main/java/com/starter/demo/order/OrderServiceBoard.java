package com.starter.demo.order;

import java.util.List;

import com.starter.demo.Board;

public class OrderServiceBoard implements OrderService<Board> {

	@Override
	public Order<Board> add(List<?> items) {

		Order<Board> order = new Order<>();
		order.setItems(items);
		order.setTotalAmount(items.stream().mapToInt(b -> ((Board) b).getPrice()).sum());
		return order;
	}

}
