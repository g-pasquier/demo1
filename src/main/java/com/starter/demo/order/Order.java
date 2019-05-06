package com.starter.demo.order;

import java.util.List;
import java.util.Random;

public class Order<T> {

	private int id = Math.abs(new Random().nextInt());
	private List<?> items;
	private int totalPrice;

	public int getId() {
		return id;
	}

	public List<?> getItems() {
		return items;
	}

	public void setItems(List<?> items) {
		this.items = items;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalAmount(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", items=" + items.size() + ", totalPrice=" + totalPrice + "]";
	}

}
