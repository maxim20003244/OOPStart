package com.AbstractClass;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        super("Black");
        this.radius = radius;

    }

    @Override
    public String getName() {
   return "Circle";
    }

    @Override
    public double getSqure() {
        return  3.1415926*radius*radius;
    }
}
