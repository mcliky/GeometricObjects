package com.Objects;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TriangleWithException {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double side1, side2, side3;
        boolean flag = false;
        while (!flag) {
            try {
                System.out.print("Enter three sides of triangle: ");
                side1 = sc.nextDouble();
                side2 = sc.nextDouble();
                side3 = sc.nextDouble();
                Triangle triangle = new Triangle(side1, side2, side3);
                flag = true;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
