package com.company;


import com.Objects.IllegalTriangleException;
import com.Objects.Triangle;
import com.Objects.TriangleWithException;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static final Scanner sc = new Scanner(System.in);
    public static final DecimalFormat df = new DecimalFormat("###.##");

    public static void main(String[] args) throws IllegalTriangleException {

        program();
    }

    private static void program() throws IllegalTriangleException {
        double side1, side2, side3;
        String color;
        String answer;
        boolean filled;
        System.out.print("Enter the first side of triangle: ");
        side1 = sc.nextDouble();
        System.out.print("Enter the second side of triangle: ");
        side2 = sc.nextDouble();
        System.out.print("Enter the third side of triangle: ");
        side3 = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the color of triangle: ");
        color = sc.nextLine();
        System.out.print("Is triangle filled?(yes/no) ");
        answer = sc.nextLine();
        filled = Objects.equals(answer, "yes");
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("The area of triangle is " + df.format(triangle.getArea()) + ", perimeter is " + df.format(triangle.getPerimeter()) + ", the color is " + triangle.getColor() + ". Is it filled? - " + triangle.isFilled());


    }
}
