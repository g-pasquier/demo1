package com.starter.demo.order;

import java.util.List;

public class Order<T> {

	private int id;
	private List<?> items;
	private int totalPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
