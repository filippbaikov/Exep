package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.*;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"1", "2", "3", "4",}, {"2", "10", "2", "7"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("неправильный размер массива!");
            }
        }
        catch (MyArrayDataException e) {
            System.out.println("Тебе сказали цифры лепи, !");
            System.out.println("Ошибка : координаты: " + e.i + "x" + e.j);
        }

    }


    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count+ Integer.parseInt(arr[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return count;
    }
}





