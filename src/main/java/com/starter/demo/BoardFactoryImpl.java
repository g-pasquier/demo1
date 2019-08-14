package com.starter.demo;

public class BoardFactoryImpl implements BoardFactory {

    public Board makeBoard(int type) {
        switch (type) {
        case 0:
            Board b = new FreestyleBoard("Johnny*Feel*Good", Camber.ROCKER);
            b.setPrice(350);
            return b;
        case 1:
            b = new FreestyleBoard("Babylon'S Wildcat", Camber.FLAT);
            b.setPrice(399);
            return b;
        case 2:
            b = new FreerideBoard("Escape To Zion", Camber.TRUE);
            b.setPrice(440);
            return b;
        default:
            return new Board() {
            };
        }
    }

}
