package com.liskov.explore.shapes;

/**
 * Created by Nader on 02/04/2018.
 */
public class ResizableSquare extends Square {
    public ResizableSquare(int sideLength) {
        super(sideLength);
    }
    public void setSideLength (int sideLength) { this.height = sideLength; this.width=sideLength; }
}
