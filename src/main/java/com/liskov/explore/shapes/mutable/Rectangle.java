package com.liskov.explore.shapes.mutable;

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
    public void setHeight (int height) { this.height = height; }

    public int getWidth () { return this.width; }
    public void setWidth (int width) { this.width = width; }
}
