package com.teachmeskills.lesson15.homework.task2.shape.abstract_shape;

public abstract class Figure {
    public abstract double calculatePerimeter();

    public void printPerimeter() {
        double perimeter = calculatePerimeter();
        System.out.println("Perimeter of the shape: " + perimeter);
    }
}
