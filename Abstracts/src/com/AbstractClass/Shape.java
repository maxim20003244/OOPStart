package com.AbstractClass;

public abstract class Shape {

    private String color ;

    public Shape(String color) {
        this.color = color;
    }

    public abstract String getName();
    public abstract double getSqure();

    public String getColor(){
        return color;
    }
}
