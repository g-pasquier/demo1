package com.starter.demo;

/**
 * 
 * @author frup70473
 *
 */
public abstract class Board {

    String name;
    Camber camber;
    String level;

    public Board(String name, Camber camber, String level) {
        this.name = name;
        this.camber = camber;
        this.level = level;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", camber=" + camber + "]";
    }

}
