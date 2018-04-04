package com.liskov.explore.shapes;

/**
 * Created by Nader on 02/04/2018.
 */
public class RectangleTests extends  AbstractRectangleTests<Rectangle> {
    @Override
    protected Rectangle build() {
        return new Rectangle(SOME_HEIGHT,SOME_WIDTH);
    }
}
