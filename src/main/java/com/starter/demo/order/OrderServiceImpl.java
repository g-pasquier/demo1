package com.starter.demo.order;

import java.util.List;
import java.util.Random;

import com.starter.demo.Board;

public class OrderServiceImpl implements OrderService {

	@Override
	public Order add(List<Board> items) {

		Order order = new Order();
		order.setId(new Random().nextInt());
		order.setItems(items);
		order.setTotalPrice(items.stream().mapToInt(b -> b.getPrice()).sum());

		return order;
	}

}
