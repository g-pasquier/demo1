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
            return new FreestyleBoard("Feelgood", Camber.ROCKER);
        case 1:
            return new FreestyleBoard("Wildcat", Camber.FLAT);
        case 2:
            return new FreerideBoard("Escape", Camber.TRUE);
        default:
            return null;
        }
    }

}
