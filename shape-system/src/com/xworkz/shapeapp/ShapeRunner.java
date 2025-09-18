package com.xworkz.shapeapp;

import com.xworkz.shapeapp.impl.TriangleImpl;
import com.xworkz.shapeapp.shape.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape=new TriangleImpl();
        shape.draw();
        shape.resize();
        shape.calculateArea();
    }
}
