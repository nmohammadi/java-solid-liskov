package com.liskov.explore.shapes;

/**
 * Created by Nader on 02/04/2018.
 */
public class SquareTests extends AbstractRectangleTests<Square>{
    @Override
    protected Square build() {
        SOME_WIDTH=SOME_HEIGHT;
        return new Square(SOME_HEIGHT);
    }
}
