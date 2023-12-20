package com.teachmeskills.lesson15.homework.task1;

import com.teachmeskills.lesson15.homework.task1.input_handle.InputHandler;
import com.teachmeskills.lesson15.homework.task1.output_handle.OutputHandler;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        InputHandler inputHandler = new InputHandler();
        numbers = inputHandler.collectNumbers();
        OutputHandler outputHandler = new OutputHandler();
        outputHandler.printEvenNumbers(numbers);
    }
}
