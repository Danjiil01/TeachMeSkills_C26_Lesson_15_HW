package com.teachmeskills.lesson15.homework.task2;

import com.teachmeskills.lesson15.homework.task2.shape.Circle;
import com.teachmeskills.lesson15.homework.task2.shape.abstract_shape.Figure;
import com.teachmeskills.lesson15.homework.task2.shape.Rectangle;
import com.teachmeskills.lesson15.homework.task2.shape.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Figure> figures = new ArrayList<>();

        figures.add(new Circle(5));
        figures.add(new Rectangle(4, 6));
        figures.add(new Triangle(3, 4, 5));
        figures.add(new Circle(10));
        figures.add(new Rectangle(8, 11));
        figures.add(new Triangle(6, 8, 10));

        for (Figure figure : figures) {
            figure.printPerimeter();
        }
    }
}
