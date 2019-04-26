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
        this.name = name;
        this.camber = camber;
    }

    public void ollie() {

    }

    @Override
    public String toString() {
        return "[name=" + name + ", camber=" + camber + "]";
    }

}
