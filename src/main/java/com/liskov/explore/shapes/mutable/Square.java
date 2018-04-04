package com.liskov.explore.shapes.mutable;

/**
 * Created by Nader on 02/04/2018.
 */
public class Square extends Rectangle {

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    public Square (int sideLength) {
        super(sideLength, sideLength);
    }
}

