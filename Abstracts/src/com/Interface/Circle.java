package com.Interface;

public class Circle implements Shape {

    private double radius;
    private String color;


    public  Circle(double r,String color){
        radius =r;
        this.color =color;
    }

    @Override
    public String name() {
        return "Circle";
    }

    @Override
    public double getSquare() {
           return  3.1415926*radius*radius;
    }

    @Override
    public String getColor() {
        return color;
    }
}
