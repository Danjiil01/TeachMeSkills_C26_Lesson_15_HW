package com.teachmeskills.lesson15.homework.task2.shape;

import com.teachmeskills.lesson15.homework.task2.shape.abstract_shape.Figure;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
