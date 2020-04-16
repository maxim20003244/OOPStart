package com.AbstractClass;

public class Rectangle extends Shape {

    private double widht;
    private double hight;




    public Rectangle(double widht,double hight) {
        super("White");
        this.widht = widht;
        this.hight = hight;
    }

    @Override
    public String  getName() {
return "Rectangle";
    }

    @Override
    public double getSqure() {
        return hight*widht;
    }
}
