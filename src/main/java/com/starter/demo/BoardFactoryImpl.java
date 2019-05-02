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
			Board b = new FreestyleBoard("Feelgood", Camber.ROCKER);
			b.setPrice(350);
			return b;
		case 1:
			b = new FreestyleBoard("Wildcat", Camber.FLAT);
			b.setPrice(399);
			return b;
		case 2:
			b = new FreerideBoard("Escape", Camber.TRUE);
			b.setPrice(440);
			return b;
		default:
			return null;
		}
	}

}
