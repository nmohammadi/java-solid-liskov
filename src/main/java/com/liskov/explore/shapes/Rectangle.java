package com.liskov.explore.shapes;

/**
 * Created by Nader on 02/04/2018.
 */
public class Rectangle {
    protected int height;
    protected int width;

    public Rectangle (int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int computeArea () { return this.height * this.width; }
    public int getHeight () { return this.height; }
    public int getWidth () { return this.width; }
}
