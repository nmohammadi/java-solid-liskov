package com.liskov.explore.shapes;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by Nader on 02/04/2018.
 */
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
        int expected = SOME_HEIGHT*SOME_WIDTH;

        //Action
        int actual = sut.computeArea();

        //Assert
        Assert.assertEquals(expected,actual);
    }
}