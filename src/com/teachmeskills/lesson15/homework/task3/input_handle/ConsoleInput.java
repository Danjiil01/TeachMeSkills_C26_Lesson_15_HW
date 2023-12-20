package com.teachmeskills.lesson15.homework.task3.input_handle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleInput {
    public static int readValidCollectionSize() {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Enter the size of collection: ");
                size = scanner.nextInt();
                if (size > 0) {
                    valid = true;
                } else {
                    System.out.println("Collection size must be positive and not equal to 0");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input error. Enter integer.");
                scanner.next();
            }
        }
        return size;
    }
}
