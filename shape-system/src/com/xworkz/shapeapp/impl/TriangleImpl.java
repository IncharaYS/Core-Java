package com.xworkz.shapeapp.impl;

import com.xworkz.shapeapp.shape.Shape;

public class TriangleImpl implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing a circle");
    }

    @Override
    public void calculateArea() {
        System.out.println("Calculating area of a a circle");
    }
}
