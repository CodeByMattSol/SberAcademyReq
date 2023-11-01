package org.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите основание: ");
        int number = scanner.nextInt();

        System.out.print("Введите степень: ");
        int degree = scanner.nextInt();

        switch (degree) {
            case 0 -> { System.out.println(1); }
            default -> { System.out.println(degreeNumber(number, degree)); }
        }

    }

    public static long degreeNumber(int n, int deg) {
        if ((n == 0 || n == 1) || deg == 1) {
            return n;
        } else {
            return n * degreeNumber(n, deg-1);
        }
    }
}