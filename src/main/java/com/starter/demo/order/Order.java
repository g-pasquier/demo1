package com.starter.demo.order;

import java.util.List;

import com.starter.demo.Board;

public class Order {

	private int id;
	private List<Board> items;
	private int totalPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Board> getItems() {
		return items;
	}

	public void setItems(List<Board> items) {
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
