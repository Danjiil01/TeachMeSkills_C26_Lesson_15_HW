package com.teachmeskills.lesson15.homework.task3.util.number_generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {
    public static List<Integer> generateRandomNumbers(int size) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;

    }
}
