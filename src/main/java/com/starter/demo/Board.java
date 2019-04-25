package com.starter.demo;

/**
 * 
 * @author frup70473
 *
 */
public abstract class Board {

	String name;
	Camber camber;

	public Board(String name, Camber camber) {
		super();
		this.name = name;
		this.camber = camber;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", camber=" + camber + "]";
	}

}
