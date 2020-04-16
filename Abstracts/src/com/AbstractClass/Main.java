package com.AbstractClass;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
   ArrayList<Shape> shapes = new ArrayList<>();
         shapes.add(new Circle(3));
        shapes.add(new Rectangle(2, 2));
         printShapes(shapes);
    }


    public static void printShapes(ArrayList<Shape> shapes){
        for (Shape shape : shapes){
            System.out.println("Name: " + shape.getName());
            System.out.println("Square: "+ shape.getSqure());
            System.out.println("Color: "+ shape.getColor());
            System.out.println();
        }
    }
}
