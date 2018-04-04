package com.liskov.explore.shapes;

/**
 * Created by Nader on 02/04/2018.
 */
public class ResizableRectangle extends Rectangle {

    public ResizableRectangle (int height, int width) {
        super(height, width);
    }

    public void setHeight (int height) { this.height = height; }
    public void setWidth (int width) { this.width = width; }

}
