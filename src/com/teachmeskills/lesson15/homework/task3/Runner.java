package com.teachmeskills.lesson15.homework.task3;

import com.teachmeskills.lesson15.homework.task3.input_handle.ConsoleInput;
import com.teachmeskills.lesson15.homework.task3.util.number_generator.RandomNumberGenerator;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        int size = ConsoleInput.readValidCollectionSize();
        List<Integer> collection = RandomNumberGenerator.generateRandomNumbers(size);

        System.out.println("Generated numbers: ");
        for (int number : collection) {
            System.out.print(number + " ");
        }
        System.out.println();

        int sum = 0;
        for (int number : collection) {
            sum += number;
        }
        double average = (double) sum / collection.size();

        System.out.println("Average of all elements in the collection: " + average);
    }
}
