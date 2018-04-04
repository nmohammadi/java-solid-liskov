package com.liskov.explore.shapes.mutable;

import junit.framework.Assert;
import junit.framework.TestCase;

public abstract class AbstractRectangleTests<T extends Rectangle> extends TestCase {
    protected T sut;
    protected  int SOME_HEIGHT = 20;
    protected  int SOME_WIDTH = 10;

    protected  abstract T build();

    protected AbstractRectangleTests() {
        sut = build();
    }

    public void testComputeArea() throws Exception {
        //Arrange
        int expected =SOME_HEIGHT*SOME_WIDTH;

        //Action
        int actual = sut.computeArea();

        //Assert
        Assert.assertEquals("Rectangle Area",expected,actual);
    }

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

}
