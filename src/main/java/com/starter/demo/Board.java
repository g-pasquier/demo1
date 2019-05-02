package com.starter.demo;

public abstract class Board {

	protected String name;
	protected Camber camber;

	protected int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getClass() + " [name=" + name + ", camber=" + camber + "]";
	}

}
