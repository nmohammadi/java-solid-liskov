package com.liskov.explore.shapes.mutable;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Nader on 02/04/2018.
 */
public class RectangleTests extends AbstractRectangleTests<Rectangle> {
    @Override
    protected Rectangle build() {
        return new Rectangle(SOME_HEIGHT,SOME_WIDTH);
    }
}

