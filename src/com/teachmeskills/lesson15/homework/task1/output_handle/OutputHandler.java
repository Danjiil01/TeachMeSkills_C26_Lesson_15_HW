package com.teachmeskills.lesson15.homework.task1.output_handle;

import java.util.ArrayList;

public class OutputHandler {
    public void printEvenNumbers(ArrayList<Integer> numbers) {
        System.out.println("Even numbers from your collection:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}
