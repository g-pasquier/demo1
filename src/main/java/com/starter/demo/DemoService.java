package com.starter.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author frup70473
 *
 */
public class DemoService {

    public List<Board> makeBoards(int nbOf) {

        BoardFactory factory = new BoardFactoryImpl();
        List<Board> boards = new ArrayList<Board>();

        for (int i = 0; i < nbOf; i++) {
            boards.add(factory.makeBoard(new Random().nextInt(3)));
        }
        return boards;
    }
}
