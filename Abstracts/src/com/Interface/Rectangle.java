package com.Interface;

public class Rectangle implements Shape {
    private double height;
    private double widht;
    private String color;

    public Rectangle(double height, double widht, String color) {
        this.height = height;
        this.widht = widht;
        this.color = color;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return height*widht;
    }

    @Override
    public String getColor() {
        return color;
    }
}
