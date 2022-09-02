package com.Objects;

public class Triangle extends GeometricObject {
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 >= side2 + side3) {
            throw new IllegalTriangleException(side1);
        }
        if (side2 >= side1 + side3) {
            throw new IllegalTriangleException(side2);
        }
        if (side3 >= side1 + side2) {
            throw new IllegalTriangleException(side3);
        } else {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter();
        double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return area;
    }

    @Override
    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3) / 2;
    }

    @Override
    public String toString() {
        return "Sides of triangle are:" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '.';
    }
}
