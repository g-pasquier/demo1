package com.starter.demo.order;

import java.util.List;

public class Order<T> {

	private int id;
	private List<T> items;
	private int totalPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<T> getItems() {
		return items;
	}

	public void setItems(List<T> items) {
		this.items = items;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", items=" + items.size() + ", totalPrice=" + totalPrice + "]";
	}

}
