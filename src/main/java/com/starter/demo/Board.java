package com.starter.demo;

/**
 * 
 * @author frup70473
 *
 */
public abstract class Board {

    protected String name;
    protected Camber camber;

    @Override
    public String toString() {
        return "[name=" + name + ", camber=" + camber + "]";
    }

}
