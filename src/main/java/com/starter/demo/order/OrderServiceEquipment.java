package com.starter.demo.order;

import java.util.List;
import java.util.Random;

import com.starter.demo.Equipment;

public class OrderServiceEquipment implements OrderService<Equipment> {

	@Override
	public Order<Equipment> add(List<?> items) {

		Order<Equipment> order = new Order<>();
		order.setId(new Random().nextInt());
		order.setItems(items);
		order.setTotalAmount(items.stream().mapToInt(e -> ((Equipment) e).getPrice()).reduce(0, (a, b) -> a + b));

		return order;
	}

}
