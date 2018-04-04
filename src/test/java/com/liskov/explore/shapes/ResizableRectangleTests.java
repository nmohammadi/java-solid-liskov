package com.liskov.explore.shapes;

import junit.framework.Assert;

/**
 * Created by Nader on 02/04/2018.
 */
public class ResizableRectangleTests extends AbstractRectangleTests<ResizableRectangle> {
    public void testSetHeight() throws Exception {
        //Arrange
        int NEW_HEIGHT = 30;

        //Action
        sut.setHeight(NEW_HEIGHT);

        //Assert
        Assert.assertEquals("Rectangle Height", NEW_HEIGHT,sut.getHeight());
        Assert.assertEquals("Rectangle Width", SOME_WIDTH,sut.getWidth());
    }


    public void testSetWidth() throws Exception {
        //Arrange
        int NEW_WIDTH = 30;

        //Action
        sut.setWidth(NEW_WIDTH);

        //Assert
        Assert.assertEquals("Rectangle Height", NEW_WIDTH,sut.getWidth());
        Assert.assertEquals("Rectangle Width", SOME_HEIGHT,sut.getHeight());
    }

    @Override
    protected ResizableRectangle build() {
        return new ResizableRectangle(SOME_HEIGHT,SOME_WIDTH);
    }
}
