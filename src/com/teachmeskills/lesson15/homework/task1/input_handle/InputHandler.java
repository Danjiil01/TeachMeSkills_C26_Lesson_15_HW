package com.teachmeskills.lesson15.homework.task1.input_handle;

import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
    public ArrayList<Integer> collectNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (enter 'exit' when ou are ready to stop):");
        while (true) {
            String input = scanner.next();
            if (input.equals("exit")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Error: enter correct number or 'exit' for completion.");
            }
        }
        return numbers;
    }
}
