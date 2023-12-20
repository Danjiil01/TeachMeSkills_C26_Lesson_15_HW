package com.teachmeskills.lesson15.homework.task2.shape;

import com.teachmeskills.lesson15.homework.task2.shape.abstract_shape.Figure;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
