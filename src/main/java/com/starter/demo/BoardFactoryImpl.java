package com.starter.demo;

/**
 * 
 * @author frup70473
 *
 */
public class BoardFactoryImpl implements BoardFactory {

	public Board makeBoard(int type) {

		switch (type) {
		case 0:
			return new FreestyleBoard("Savage", Camber.ROCKER);
		case 1:
			return new FreerideBoard("Backcountry", Camber.TRUE);
		case 2:
			return new FreerideBoard("Cat", Camber.TRUE);
		default:
			return null;
		}
	}

}
