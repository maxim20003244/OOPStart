package com.Interface;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Shape> shapes = new ArrayList<Shape>();
	    Shape shape = new Circle(2, "Pink");
	    shapes.add(shape);

	    shapes.add(new Rectangle(2, 2, "Green"));

	    Main.printShapes(shapes);
    }


    public static void printShapes(ArrayList<Shape> shapes){
        for(Shape shape : shapes){
            System.out.println("Name: "+ shape.name());
            System.out.println("Square: "+ shape.getSquare());
            System.out.println("Color: "+ shape.getColor());
            System.out.println();
        }
    }
}
